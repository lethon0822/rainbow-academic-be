package com.rainbowuniv.academicmenagmentbe.grade;


import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;
    private final ProfessorService professorService;







}
