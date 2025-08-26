package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalMapper {

    // 신청서 목록 조회
    List<ApprovalAppGetRes> ApplicationList(ApprovalAppGetReq req);

    // 신청 승인 처리
    int modifyStatus(ApprovalPatchReq req);

    // 학적 상태 휴학으로 변경
    int changeStudentStatus(int userId);

    // 강의 개설 신청 리스트
    List<ApprovalCourseGetRes> findCoursesByStatus(ApprovalCourseGetReq req);

    // 강의 개설 상태 변경
    int changeCourseStatus(ApprovalCoursePatchReq req);
}
