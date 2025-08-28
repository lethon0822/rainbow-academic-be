package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model.GradePostReq;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllGradesReq;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllGradesRes;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import com.rainbowuniv.academicmenagmentbe.sugang.model.MySugangListRes;
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
                                            @ModelAttribute GetAllGradesReq getAllGradesReq) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        List<GetAllGradesRes> getAllGradesRes = gradeService.getMyAllGrades(userId, getAllGradesReq);
        return ResponseEntity.ok().body(getAllGradesRes);

    }

}
