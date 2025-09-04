package com.rainbowuniv.academicmenagmentbe.student.lectures.model;

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