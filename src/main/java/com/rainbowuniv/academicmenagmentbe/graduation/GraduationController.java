package com.rainbowuniv.academicmenagmentbe.graduation;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.graduation.model.GraduationCheckDTO;
import com.rainbowuniv.academicmenagmentbe.graduation.model.GraduationCheckRes;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/student/graduation")
@RequiredArgsConstructor
public class GraduationController {
    private final GraduationService graduationService;

    // 졸업 진단
    @GetMapping()
    public ResponseEntity<?> getMyGraduationDiagnosis(HttpServletRequest httpReq) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");
        GraduationCheckRes res = graduationService.getMyGraduationDiagnosis(userId);
        return ResponseEntity.ok(res);
    }


}