package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalAppGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalAppGetRes;
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
    public List<ApprovalAppGetRes> ApplicationList(ApprovalAppGetReq req){
        List<ApprovalAppGetRes> list = approvalMapper.ApplicationList(req);
        log.info("list", list);
        return list;
    }

    public String modifyStatus(ApprovalPatchReq req){
       int result =  approvalMapper.modifyStatus(req);
        
        if(result == 1 && req.getStatus() == "승인") {
            approvalMapper.changeStatus(req.getUserId());
            return "승인 완료";
        } else if (req.getStatus() == "거부") {
            return "승인 거부";
        }
        return "문제 발생 ";
    //TODO 예외처리
    }


}
