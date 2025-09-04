package com.rainbowuniv.academicmenagmentbe.profile;

import com.rainbowuniv.academicmenagmentbe.account.etc.AccountConstants;
import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.grade.GradeService;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeDTO;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeSearchReq;
import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import com.rainbowuniv.academicmenagmentbe.profile.model.EnrollStatusReq;
import com.rainbowuniv.academicmenagmentbe.profile.model.ProfileDTO;
import jakarta.servlet.http.HttpServletRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
@Slf4j
public class ProfileController {
    private final GradeService gradeService;
    private final ProfessorService professorService;
    private final ProfileService profileService;


    // 성적조회(간소) - 학생용
    @GetMapping("/rank")
    public List<GradeDTO> getSimpleGrades(@ModelAttribute GradeSearchReq searchReq) {
        return gradeService.findBySimpleGrade(searchReq);
    }

    // 성적 전체 조회
    @GetMapping("/grade/all")
    public ResponseEntity<?> getGrades(
            @RequestParam Integer userId,
            @RequestParam(required = false) Integer courseId,
            @RequestParam(required = false) Integer semester,
            @RequestParam(required = false, defaultValue = "grades") String type) {

        if (userId == null) {
            return ResponseEntity.badRequest().body("userId is required");
        }

        Map<String, Object> params = new HashMap<>();
        params.put("userId", userId);
        params.put("courseId", courseId == null ? -1 : courseId);
        params.put("semester", semester == null ? -1 : semester);

        switch (type) {
            case "grades":
                return ResponseEntity.ok(gradeService.getGradesBySubject(params));
            case "category":
                return ResponseEntity.ok(gradeService.getCreditByCategory(params));
            case "semester":
                return ResponseEntity.ok(gradeService.getSemesterGrades(params));
            default:
                return ResponseEntity.badRequest().body("Invalid type");
        }
    }


    // 학생 프로필
    @GetMapping("/profile")
    public ResponseEntity<ProfileDTO> getStudentProfile(HttpServletRequest httpReq) {
        Integer userId = (Integer) HttpUtils.getSessionValue(httpReq, AccountConstants.USER_ID_NAME);
        System.out.println("세션에서 가져온 userId: " + userId);

        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }

        ProfileDTO profile = profileService.findStudentProfile(userId);
        if (profile == null) {
            return ResponseEntity.ok(new ProfileDTO());
        }
        return ResponseEntity.ok(profile);
    }

}

