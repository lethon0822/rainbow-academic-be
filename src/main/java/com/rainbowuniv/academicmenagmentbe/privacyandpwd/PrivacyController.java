package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class PrivacyController {
    private final PrivacyService privacyService;

    @PutMapping("/privacy")
    public String update (@RequestBody PrivacyPutReq req) {
        privacyService.updateMyPrivacy(req);
        return "success";
    }
}
