package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professor/course")
@RequiredArgsConstructor
public class GradeController {

    private final GradeService gradeService;

    @PutMapping("/grade")
    public ResponseEntity<String> updateGrade(@RequestBody GradeUpdateReq req) {
       gradeService.updateGrade(req);
       return ResponseEntity.ok("성적 저장 완료");
    }
}
