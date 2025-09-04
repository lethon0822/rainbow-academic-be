package com.rainbowuniv.academicmenagmentbe.staff.member;


import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/staff/member")
public class MemberController {
    private final MemberService memberService;

    //  추후 User 폴더 생성시 이 파일의 내용은 user로 이동
    @GetMapping
    public ResponseEntity<?> getMember(@ModelAttribute MemberGetReq req) {
        return ResponseEntity.ok(memberService.findUser(req));
    }

}
