package com.rainbowuniv.academicmenagmentbe.staff.member;

import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public List<MemberGetRes> findUser(MemberGetReq req){
        return memberMapper.findUser(req);
    }
}
