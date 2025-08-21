package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor/course")
@Slf4j
@RequiredArgsConstructor
public class EnrollmentGradeController {
    private final EnrollmentGradeService enrollmentGradeService;
    private final EnrollmentGradeMapper enrollmentGradeMapper;

    @PostMapping("/grade") // 새로운 성적 입력
    public ResponseEntity<?> createGrade(@RequestBody GradePutReq req) {
        enrollmentGradeMapper.enrollmentGrade(req);
        return ResponseEntity.ok("성적 신규 저장 완료");
    }

    @PutMapping("/grade/students") // 기존 성적 수정
    public ResponseEntity<?> updateGrade(@RequestBody GradePutReq req) {
        enrollmentGradeMapper.enrollmentGrade(req);
        return ResponseEntity.ok("성적 수정 완료");
    }
}
