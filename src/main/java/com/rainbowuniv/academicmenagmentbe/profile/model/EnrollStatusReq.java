package com.rainbowuniv.academicmenagmentbe.profile.model;

import lombok.AllArgsConstructor;
import lombok.Getter;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollStatusReq {
    private String status;
    private int courseId;
    private int userId;
}