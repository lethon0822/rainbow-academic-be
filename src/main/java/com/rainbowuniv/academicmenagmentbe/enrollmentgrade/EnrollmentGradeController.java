package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;

import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.EnrollmentGradePutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor/course")
@RequiredArgsConstructor
public class EnrollmentGradeController {

    private final EnrollmentGradeService enrollmentGradeService;

    @PutMapping("/grade")
    public ResponseEntity<String> updateGrade(@RequestBody EnrollmentGradePutReq req) {
       enrollmentGradeService.updateGrade(req);
       return ResponseEntity.ok("성적 저장 완료");
    }
}
