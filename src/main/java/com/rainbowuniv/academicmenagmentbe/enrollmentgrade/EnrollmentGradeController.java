package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor/course")
@Slf4j
@RequiredArgsConstructor
public class EnrollmentGradeController {
    private final EnrollmentGradeService enrollmentGradeService;
    private final EnrollmentGradeMapper enrollmentGradeMapper;

    @PutMapping("/grade")
    public ResponseEntity<?> enrollmentGrade(@RequestBody GradePutReq req) {
        enrollmentGradeMapper.enrollmentGrade(req);
        return ResponseEntity.ok("성적 저장 완료");
    }
}
