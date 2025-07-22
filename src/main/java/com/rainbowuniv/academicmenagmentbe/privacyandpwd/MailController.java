package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/account")
public class MailController {
    private final MailService mailService;



//    @ResponseBody
//    @PostMapping("/renewal") // 이 부분은 각자 바꿔주시면 됩니다.
//    public String emailCheck(@RequestBody MailDto dto) throws MessagingException, UnsupportedEncodingException {
//        String authCode = mailService.sendSimpleMessage(dto.getEmail());
//        return authCode; // Response body에 값을 반환
//    }
}