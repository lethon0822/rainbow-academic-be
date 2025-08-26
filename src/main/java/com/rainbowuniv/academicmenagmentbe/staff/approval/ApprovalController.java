package com.rainbowuniv.academicmenagmentbe.staff.approval;


import com.rainbowuniv.academicmenagmentbe.staff.approval.model.*;
import lombok.Getter;
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
    public ResponseEntity<?> ApplicationList(@RequestBody ApprovalAppGetReq req){
        List<ApprovalAppGetRes> result = approvalService.ApplicationList(req);
        return ResponseEntity.ok(result);
    }

    // 신청서 승인여부 결정
    @PatchMapping
    public ResponseEntity<?> decideApplication(@RequestBody ApprovalPatchReq req){
        String result = approvalService.modifyStatus(req);
        return ResponseEntity.ok(result);
    }


    // 강의 개설 신청 리스트
    @GetMapping("/course")
    public ResponseEntity<?> getUnapprovedCourse(@ModelAttribute ApprovalCourseGetReq req){
        List<ApprovalCourseGetRes> result = approvalService.unapprovedCourse(req);
        return ResponseEntity.ok(result);
    }



    // 강의 개설 승인여부 결정
    @PatchMapping("/course")
    public ResponseEntity<?> patchCourseStatus(@RequestBody ApprovalCoursePatchReq req){
        String result = approvalService.changeCourseStatus(req);
        return ResponseEntity.ok(result);
    }

}
