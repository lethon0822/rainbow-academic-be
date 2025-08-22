package com.rainbowuniv.academicmenagmentbe.staff.approval.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ApprovalGetReq {
    private int year;
    private int semester;
    private String scheduleType;
}
