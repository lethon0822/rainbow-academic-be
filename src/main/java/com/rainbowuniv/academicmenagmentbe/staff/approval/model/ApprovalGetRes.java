package com.rainbowuniv.academicmenagmentbe.staff.approval.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApprovalGetRes {
    private int appId;
    private int userId;
    private String createdAt;
    private String status;
    private String reason;
    private String userName;
    private String deptName;
    private String scheduleType;
}
