package com.rainbowuniv.academicmenagmentbe.sugang;

import com.rainbowuniv.academicmenagmentbe.sugang.model.MySugangListRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangRes;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface SugangMapper {

    // 중복 수강 신청 금지
    int isAlreadyApplied(SugangReq req);

    // 정원 초과 수강 신청 금지 - 잔여 인원 체크
    int checkRemainingSeats(SugangReq sugangReq);

    // 수강 신청 시도
    int courseEnrollment(SugangReq sugangReq);

    // 수강 신청 정보 뿌리기
    SugangRes sugangCourseInfo(SugangReq req);

    // 이번 학기 수강 신청한 과목들 목록 전체 조회용
    List<MySugangListRes> findAppliedCoursesByUserId(int userId);

    // 수강 신청 성공시 잔여 인원 -1
    int decreaseRemainingSeats(SugangReq sugangReq);

    // 수강 취소를 할 수 있다.
    int sugangCancel(int courseId, int userId);

    // 수강 취소 성공시 잔여 인원 +1
    int increaseRemainingSeats(int courseId);






}
