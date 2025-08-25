package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalPatchReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalMapper {

    // 신청서 목록 조회
    List<ApprovalGetRes> ApplicationList(ApprovalGetReq req);

    // 신청 승인 처리
    int modifyStatus(ApprovalPatchReq req);
}
