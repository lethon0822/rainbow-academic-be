package com.rainbowuniv.academicmenagmentbe.enrollmentgrade;


import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePostReq;
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

    @PostMapping("/grade")
    public ResponseEntity<?> PostGrade(@RequestBody List<GradePostReq> req) {
        enrollmentGradeService.save(req);
        return ResponseEntity.ok("성적 저장 완료");
    }

    @PutMapping("/grade")
    public ResponseEntity<?> enrollmentGrade(@RequestBody List<GradePutReq> req) {
        enrollmentGradeService.enrollmentGrade(req);
        return ResponseEntity.ok("성적 수정 완료");
    }

    @GetMapping("/grade/students")
    public ResponseEntity<List<GradePutReq>> getStudents(@RequestParam Long courseId) {
        List<GradePutReq> students = enrollmentGradeService.getStudentsByCourseId(courseId);
        return ResponseEntity.ok(students);
    }
}
