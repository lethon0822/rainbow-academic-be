package com.rainbowuniv.academicmenagmentbe.profile.model;

import lombok.Data;

@Data
public class ProfileDTO {
    private String loginId;
    private String userName;
    private String email;
    private String userRole;
    private String professorName;
    private String status;
    private Integer grade;
    private Integer semester;
    private String deptName;
    private int year;
    private Integer totalCredits;
}
