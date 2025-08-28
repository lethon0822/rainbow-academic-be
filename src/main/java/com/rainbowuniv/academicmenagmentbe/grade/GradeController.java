package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllPermanentGradeReq;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllPermanentGradeRes;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/student/grade")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;
    private final ProfessorService professorService;

    @GetMapping("/permanent")
    public ResponseEntity<?> getMyAllGrades(HttpServletRequest httpReq,
                                            @ModelAttribute GetAllPermanentGradeReq req) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        List<GetAllPermanentGradeRes> res = gradeService.getAllPermanentGrade(userId, req);
        return ResponseEntity.ok().body(res);

    }

}
