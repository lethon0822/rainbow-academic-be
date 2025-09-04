package com.rainbowuniv.academicmenagmentbe.lectures;


import com.rainbowuniv.academicmenagmentbe.account.etc.AccountConstants;
import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.profile.model.EnrollStatusReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
@Slf4j
public class LecturesController {
    private final LectureService lectureService;

    // 강의 평가 학생용 등록
    @PutMapping("/course/survey")
    public ResponseEntity<String> studentSurvey(HttpServletRequest httpReq,
                                                @RequestBody LecturesEvaluationDto dto) {
        Integer userId = (Integer) HttpUtils.getSessionValue(httpReq, AccountConstants.USER_ID_NAME);
        dto.setUserId(userId);

        log.info("dto", dto);
        int result = lectureService.studentSurvey(dto);
        if (result == 1) {
            String status = "수강완료";
            EnrollStatusReq req = new EnrollStatusReq(status, dto.getEnrollmentId());
            lectureService.studentStatus(req);

            return ResponseEntity.ok("강의 평가 등록 성공");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("강의 평가 등록 실패");
    }

}
