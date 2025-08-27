package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account/privacy")
public class PrivacyController {
    private final PrivacyService privacyService;

    @GetMapping
    public ResponseEntity<?> select (HttpServletRequest req) {
        int userId = (int) HttpUtils.getSessionValue(req, "userId");
        PrivacyGetRes result = privacyService.selectMyPrivacy(userId);
        return ResponseEntity.ok(result);
    }

    @PutMapping
    public ResponseEntity<?> update (HttpServletRequest httpReq, @RequestBody PrivacyPutReq req) {
        int result = (int) HttpUtils.getSessionValue(httpReq, "userId");
        req.setUserId(result);
        log.info("으어어어억{}", result);
        int result2 = privacyService.updateMyPrivacy(req);
        return ResponseEntity.ok(result2);
    }
}
