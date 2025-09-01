package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllPermanentGradeReq;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetAllPermanentGradeRes;
import com.rainbowuniv.academicmenagmentbe.grade.model.GetMyCurrentGradeRes;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/student/grade")
@RequiredArgsConstructor
public class GradeController {
    private final GradeService gradeService;

    // 영구 성적 조회 ( 금학기 제외 )
    @GetMapping("/permanent")
    public ResponseEntity<?> getMyAllGrades(HttpServletRequest httpReq,
                                            @ModelAttribute GetAllPermanentGradeReq req) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        log.info("semester id {}", req.getSemesterId());


        List<GetAllPermanentGradeRes> res = gradeService.getAllPermanentGrade(userId, req);
        return ResponseEntity.ok().body(res);

    }

    // 금학기 성적 조회 ( 중간, 기말 점수 등 포함 )
    @GetMapping("current")
    public ResponseEntity<?> getMyCurrentGrades(HttpServletRequest httpReq, @RequestParam int semesterId) {
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");
        List<GetMyCurrentGradeRes> res = gradeService.getMyCurrentGrades(userId, semesterId);
        return ResponseEntity.ok().body(res);
    }

}
