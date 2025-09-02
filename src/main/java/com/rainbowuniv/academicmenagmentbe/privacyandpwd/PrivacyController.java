package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class PrivacyController {
    private final PrivacyService privacyService;

    @GetMapping("/privacy")
    public ResponseEntity<?> selectPrivacy (HttpServletRequest req) {
        int userId = (int) HttpUtils.getSessionValue(req, "userId");
        PrivacyGetRes result = privacyService.selectMyPrivacy(userId);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/privacy")
    public ResponseEntity<?> updatePrivacy (HttpServletRequest httpReq, @RequestBody PrivacyPutReq req) {
        int result = (int) HttpUtils.getSessionValue(httpReq, "userId");
        log.info("으어어어억{}", result);
        req.setUserId(result);
        log.info("세션에 저장된 userId={}", result);
        int result2 = privacyService.updateMyPrivacy(req);
        return ResponseEntity.ok(result2);
    }

    @PutMapping("/renewal")
    public ResponseEntity<?> updatePwd (HttpServletRequest httpReq, @RequestBody PwdPutReq req) {
//        int result = privacyService.updateMyPwd(req);
//        if (req.getEmail().equals(httpReq.getParameter("email"))) {
//
//        }
        return ResponseEntity.ok().build();
    }
}
