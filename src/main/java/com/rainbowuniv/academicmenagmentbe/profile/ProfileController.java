package com.rainbowuniv.academicmenagmentbe.profile;

import com.rainbowuniv.academicmenagmentbe.grade.GradeService;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeDTO;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeSearchReq;
import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorService;
import com.rainbowuniv.academicmenagmentbe.profile.model.ProfileDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
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

        if (courseId == null) {
            courseId = -1;
        }

        if (semester == null) {
            semester = -1;
        }

        switch (type) {
            case "grades":
                return ResponseEntity.ok(gradeService.getGradesBySubject(userId, courseId, semester));
            case "category":
                return ResponseEntity.ok(gradeService.getCreditByCategory(userId, courseId, semester));
            case "semester":
                return ResponseEntity.ok(gradeService.getSemesterGrades(userId, courseId, semester));
            default:
                return ResponseEntity.badRequest().body("Invalid type");
        }
    }

    // 강의 평가 학생용
    @PostMapping("/course/survey")
    public ResponseEntity<String> studentSurvey(@RequestBody LecturesEvaluationDto dto) {
        int result = professorService.studentSurvey(dto);
        if (result == 1) {
            return ResponseEntity.ok("강의 평가가 성공적으로 등록되었습니다.");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("강의 평가 등록에 실패했습니다.");
    }

    // 학생 프로필
    @GetMapping("/profile")
    public ProfileDTO getStudentProfile(@RequestParam String loginId) {
        return profileService.findStudentProfile(loginId);
    }
}

