package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.AppPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/application")
public class ApplicationController {
    private final ApplicationService applicationService;

    // 학생, 교수의 신청
    @PostMapping
    public ResponseEntity<?> insertAppForReason (@RequestBody AppPostReq req) {
        return ResponseEntity.ok(applicationService.insertAppForReason(req));
    }

}
