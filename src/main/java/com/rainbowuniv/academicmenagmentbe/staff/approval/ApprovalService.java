package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalPatchReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ApprovalService {
    private final ApprovalMapper approvalMapper;

    //신청서 리스트
    public List<ApprovalGetRes> ApplicationList(ApprovalGetReq req){
        List<ApprovalGetRes> list = approvalMapper.ApplicationList(req);
        log.info("list", list);
        return list;
    }

    public void modifyStatus(ApprovalPatchReq req){
       int result =  approvalMapper.modifyStatus(req);
    //TODO 학생 상태 변경
//        if(result == 1) {
//
//        }
    //TODO 예외처리
    }


}
