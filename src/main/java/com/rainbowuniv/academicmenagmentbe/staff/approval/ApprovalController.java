package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalGetRes;
import com.rainbowuniv.academicmenagmentbe.staff.approval.model.ApprovalPatchReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RequestMapping("api/staff/approval")
@RestController
@Slf4j
public class ApprovalController {
    private final ApprovalService approvalService;

    // 신청서 조회
    @GetMapping
    public ResponseEntity<?> ApplicationList(@RequestBody ApprovalGetReq req){
        List<ApprovalGetRes> result = approvalService.ApplicationList(req);
        return ResponseEntity.ok(result);
    }

    //    신청서 승인여부 결정
    @PatchMapping
    public ResponseEntity<?> decideApplication(@RequestBody ApprovalPatchReq req){
        approvalService.modifyStatus(req);
        return ResponseEntity.ok("수정완료");
    }

}
