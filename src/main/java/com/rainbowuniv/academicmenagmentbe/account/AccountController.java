package com.rainbowuniv.academicmenagmentbe.account;

import com.rainbowuniv.academicmenagmentbe.account.etc.AccountConstants;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdRes;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginRes;
import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;

    @PostMapping("/login")
    public ResponseEntity<?> login(HttpServletRequest httpReq, @RequestBody AccountLoginReq req) {
        AccountLoginRes result = accountService.login(req);
        if(result == null) {
            return ResponseEntity.notFound().build();
        }

        //세션처리
        HttpUtils.setSession(httpReq,AccountConstants.USER_ID_NAME, result.getUserId());
        log.info("됐다");
        return ResponseEntity.ok(result);
    }
//    @GetMapping("/id")
//    public ResponseEntity<?> findId (@RequestParam String email, @RequestParam String phone) {
//        AccountFindIdReq req = new AccountFindIdReq(email, phone);
//        AccountFindIdRes result = accountService.findIdByEmailAndPhone(req);
//        return ResponseEntity.ok(result);
//    }

    @GetMapping("/id")
    public ResponseEntity<?> findId (@ModelAttribute AccountFindIdReq req){
        AccountFindIdRes result = accountService.findIdByEmailAndPhone(req);
        log.info("req:{}",req);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/check")
    public ResponseEntity<?> check(HttpServletRequest httpReq) {
        Integer id = (Integer)HttpUtils.getSessionValue(httpReq,AccountConstants.USER_ID_NAME);
        log.info("id: {}",id);
        return ResponseEntity.ok(id);
    }
    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest httpReq) {
        HttpUtils.removeSessionValue(httpReq,AccountConstants.USER_ID_NAME);
        return ResponseEntity.ok(1);
    }

}