package com.rainbowuniv.academicmenagmentbe.staff.approval.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApprovalCoursePatchReq {
    private int courseId;
    private String status;
}
