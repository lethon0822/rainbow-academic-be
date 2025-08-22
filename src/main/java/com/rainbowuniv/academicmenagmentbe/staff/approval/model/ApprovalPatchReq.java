package com.rainbowuniv.academicmenagmentbe.staff.approval.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import java.beans.ConstructorProperties;


@Getter
@AllArgsConstructor
public class ApprovalPatchReq {
    private int appId;
    private String status;
    private int userId;

}
