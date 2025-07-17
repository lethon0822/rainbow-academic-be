package com.rainbowuniv.academicmenagmentbe.account;

import com.rainbowuniv.academicmenagmentbe.account.etc.AccountConstants;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountIDReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginRes;
import com.rainbowuniv.academicmenagmentbe.common.util.HttpUtils;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        HttpUtils.setSession(httpReq, AccountConstants.USER_ID_NAME, result.getUserId());
        return ResponseEntity.ok(result);
    }
    @GetMapping("/id")
    public ResponseEntity<?> getDeptList() {
        List<AccountIDReq> result = accountService.findByDeptId();
        return ResponseEntity.ok(result);
    }
}
