package com.rainbowuniv.academicmenagmentbe.staff.department;


import com.rainbowuniv.academicmenagmentbe.staff.department.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/staff/department")
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {
    private final  DepartmentService departmentService;

    // 학과 관련

    // 학과 개설
    @PostMapping
    public ResponseEntity<?> saveDepartment(@RequestBody DepartmentPostReq req){
        departmentService.saveDept(req);
        return ResponseEntity.ok("학과 개설 성공");
    }

    // 학과 조회
    @GetMapping
    public ResponseEntity<?> findDepartment(@ModelAttribute DepartmentGetReq req){
        log.info("알이큐:{}",req);
        if (req.getStatus() == "null") {
            DepartmentGetReq req2 = new DepartmentGetReq(null, req.getKeyword());
        }
        List<DepartmentGetRes> result = departmentService.findAllDepartment(req);
        return ResponseEntity.ok(result);
    }

    // 학과 소속 교수진 조회
    @GetMapping("/head")
    public ResponseEntity<?> findDeptHead(@RequestParam("dept_id")int deptId){
        log.info("아이디{}", deptId);
        List<DepartmentHeadName> result = departmentService.findDeptHead(deptId);
        return ResponseEntity.ok(result);
    }

    // 학과 정보 수정
    @PutMapping
    public ResponseEntity<?> updateDept(@RequestBody DepartmentPutReq req){
        departmentService.updateDept(req);
        return ResponseEntity.ok("수정됨");
    }

    // 학과 상태 수정
    @PatchMapping
    public ResponseEntity<?> updateStatus(@RequestParam("id") int deptId){
        DepartmentPatchReq req = new DepartmentPatchReq(deptId);
        departmentService.updateStatus(req);
        return ResponseEntity.ok("학과 상태 수정");
    }



}
