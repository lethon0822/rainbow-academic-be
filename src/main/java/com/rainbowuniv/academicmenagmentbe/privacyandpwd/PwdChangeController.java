package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account/")
public class PwdChangeController {
    private final PwdChangeService pwdChangeService;

    @PutMapping("/renewal")
    public ResponseEntity<?> changePwd (@RequestBody PwdPutReq req) {



        int result = pwdChangeService.changePwdById(req);
        return ResponseEntity.ok(result);
    }
}
