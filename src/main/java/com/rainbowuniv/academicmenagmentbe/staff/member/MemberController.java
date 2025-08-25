package com.rainbowuniv.academicmenagmentbe.staff.member;


import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/staff/member")
public class MemberController {
    private final MemberService memberService;

    //  추후 User 폴더 생성시 이 파일의 내용은 user로 이동
    @GetMapping
    public ResponseEntity<?> GetMember(@ModelAttribute MemberGetReq req){
        List<MemberGetRes> result = memberService.findUser(req);
        return ResponseEntity.ok(result);
    }

}
