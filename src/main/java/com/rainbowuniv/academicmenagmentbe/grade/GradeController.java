package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeDTO;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeReq;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeSearchReq;
import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import com.rainbowuniv.academicmenagmentbe.profile.ProfileService;
import com.rainbowuniv.academicmenagmentbe.profile.model.ProfileDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;
    private final ProfessorService professorService;


    // 성적 등록 및 수정 - 교수용
    @PutMapping("/professor/course/grade")
    public ResponseEntity<String> updateGrade(@RequestBody GradeReq req) {
        gradeService.updateGrade(req);
        return ResponseEntity.ok("성적 등록 완료");
    }
}
