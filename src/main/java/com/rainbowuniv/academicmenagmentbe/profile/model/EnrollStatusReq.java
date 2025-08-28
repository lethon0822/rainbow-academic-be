package com.rainbowuniv.academicmenagmentbe.profile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EnrollStatusReq {
    private String status;
    private int enrollmentId;
}
