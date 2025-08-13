package com.rainbowuniv.academicmenagmentbe.sugang;


import com.rainbowuniv.academicmenagmentbe.sugang.model.MySugangListRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangErrorRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SugangService {
    private final SugangMapper sugangMapper;

    @Transactional
    public ResponseEntity<?> handleEnrollCourse(SugangReq req){

        // 이미 신청한 강의 중복 수강 신청 시
        if(isAlreadyApplied(req) > 0){
            return ResponseEntity.badRequest()
                    .body(new SugangErrorRes(SugangErrorCode.ALREADY_APPLIED));
        }

        // 잔여 인원 0명인 강의를 수강 신청 시
        if(checkRemainingSeats(req) <= 0){
            return ResponseEntity.badRequest()
                    .body(new SugangErrorRes(SugangErrorCode.NO_REMAINING_SLOT));
        }

        // 수강 신청 시도
        int result = sugangMapper.courseEnrollment(req);

        // 서버 오류로 수강 신청 실패 시
        if (result <= 0){
            return ResponseEntity.internalServerError()
                    .body(new SugangErrorRes(SugangErrorCode.SERVER_ERROR));
        }
        // 수강 신청 성공 시 후처리
        sugangMapper.decreaseRemainingSeats(req); // 잔여 인원 -1
        SugangRes res = sugangMapper.sugangCourseInfo(req); // res 받아오기
        return ResponseEntity.ok(res);
    }

    @Transactional
    public int cancelCourse(int courseId, int userId){
        int cancelCount = sugangMapper.sugangCancel(courseId, userId); //수강 취소

        if (cancelCount > 0){ // 수강 취소 성공
            remPlus1(courseId); // 잔여인원 복구
        }
        return cancelCount;
    }


    public int remPlus1(int courseId){return sugangMapper.increaseRemainingSeats(courseId);}

    public int isAlreadyApplied(SugangReq req){
        return sugangMapper.isAlreadyApplied(req);
    }

    public int checkRemainingSeats(SugangReq req) {
        return sugangMapper.checkRemainingSeats(req);
    }


    public List<MySugangListRes> findAppliedCoursesByUserId(int userId, int year, int semester){
        return sugangMapper.findAppliedCoursesByUserId(userId, year, semester);
    }


}
