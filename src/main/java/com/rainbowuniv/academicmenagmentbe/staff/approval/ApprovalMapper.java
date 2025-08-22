package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalPatchReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApprovalMapper {

    int modifyStatus(ApprovalPatchReq req);
    List<ApprovalGetRes> findApplicationList(ApprovalGetReq req);
}
