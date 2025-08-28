package com.rainbowuniv.academicmenagmentbe.staff.member.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.beans.ConstructorProperties;

@Getter

public class MemberGetReq {
    private String userRole;
    private Integer deptId;


    @ConstructorProperties({"user_role", "dept_id"})
    public MemberGetReq(String userRole, Integer deptId) {
        this.userRole = userRole;
        this.deptId = deptId;
    }


}
