package com.rainbowuniv.academicmenagmentbe.staff.member;

import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetReq;
import com.rainbowuniv.academicmenagmentbe.staff.member.model.MemberGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<MemberGetRes> findUser(MemberGetReq req);

}
