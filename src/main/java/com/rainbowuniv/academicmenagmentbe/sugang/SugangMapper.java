package com.rainbowuniv.academicmenagmentbe.sugang;

import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangListRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangRes;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface SugangMapper {
    // 수강 신청을 할 수 있다.
    int courseEnrollment(SugangReq sugangReq);

    // 수강 신청 정보 뿌리기
    SugangRes sugangCourseInfo(SugangReq req);

    // 이번 학기 수강 신청한 과목들 목록 전체 조회용
    List<SugangListRes> findAppliedCoursesByUserId(int userId, int year, int semester);

    // 수강 신청 성공시 잔여 인원 -1
    int decreaseRemainingSeats(SugangReq sugangReq);

    // 잔여 인원 0이면 수강 신청 불가
    int getRemainingSeats(SugangReq sugangReq);

    // 수강 취소를 할 수 있다.
    int sugangCancel(int courseId, int userId);

    // 수강 취소 성공시 잔여 인원 +1
    int increaseRemainingSeats(int courseId);






}
