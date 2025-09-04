package com.rainbowuniv.academicmenagmentbe.lectures.model;

import lombok.AllArgsConstructor;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollStatusReq {
    private String status;
    private int enrollmentId;

}