package com.rainbowuniv.academicmenagmentbe.staff.approval.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApprovalGetRes {
    private int appId;
    private String createdAt;
    private String status;
    private String reason;
    private int userId;
    private String userName;
    private String deptName;
    private String scheduleType;

}
