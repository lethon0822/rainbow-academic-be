package com.rainbowuniv.academicmenagmentbe.staff.approval.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApprovalCourseGetReq {
    private int year;
    private int semester;

}
