package com.rainbowuniv.academicmenagmentbe.privacyandpwd.email;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.email.model.EmailCheckDto;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.email.model.EmailRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping ("/email/send")
    public String sendMail(@RequestBody EmailRequestDto emailRequestDto){
        System.out.println("이메일 인증 이메일 :"+emailRequestDto.getEmail());
        return userService.authMail(emailRequestDto.getEmail());
    }

    @PostMapping("/email/check")
    public String checkAuthNum(@RequestBody EmailCheckDto emailCheckDto){
        Boolean Checked = userService.checkAuthNum(emailCheckDto.getEmail(),emailCheckDto.getAuthNum());
        if(Checked){
            log.info("으에에에에엑");
            return "ok";
        }
        else{
            throw new NullPointerException("잘못된 번호다");
        }
    }
}