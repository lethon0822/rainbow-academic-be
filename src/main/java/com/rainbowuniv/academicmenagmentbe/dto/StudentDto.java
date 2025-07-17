package com.rainbowuniv.academicmenagmentbe.dto;

import lombok.Data;

@Data
public class StudentDto {
    private int userId;
    private String name;
    private String email;
    private String phone;
    private int enrollmentId;
}
