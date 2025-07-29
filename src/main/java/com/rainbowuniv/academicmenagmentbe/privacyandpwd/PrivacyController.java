package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
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

    @GetMapping("/privacy/{userId}")
    public ResponseEntity<?> select (@RequestParam int userId) {
        PrivacyGetRes result = privacyService.selectMyPrivacy(userId);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/privacy")
    public ResponseEntity<?> update (@RequestBody PrivacyPutReq req) {
        int result = privacyService.updateMyPrivacy(req);
        return ResponseEntity.ok(result);
    }
}
