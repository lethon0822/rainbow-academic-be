package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeDTO;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeSearchReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    // 성적조회(간소)
    @GetMapping("/student/rank")
    public List<GradeDTO> getSimpleGrades(@ModelAttribute GradeSearchReq p) {
        return gradeService.findBySimpleGrade(p);

    }
}