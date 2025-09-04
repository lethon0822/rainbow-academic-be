package com.rainbowuniv.academicmenagmentbe.student.profile;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.student.profile.model.StudentProfileInfoRes;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mypage")
@RequiredArgsConstructor
@Slf4j

// 학적 조회
public class StudentProfileController {
    private final StudentProfileService studentProfileService;

    @GetMapping
    public ResponseEntity<?> findStudentProfileInfo(HttpServletRequest httpReq) {

        // 유저 아이디 세션 처리
        int userId = (int) HttpUtils.getSessionValue(httpReq, "userId");

        StudentProfileInfoRes studentProfileInfoRes = studentProfileService.findStudentProfileInfo(userId);
        return ResponseEntity.ok().body(studentProfileInfoRes);

    }


}
