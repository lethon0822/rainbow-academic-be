package com.rainbowuniv.academicmenagmentbe.profile.model;

import lombok.Data;

@Data
public class ProfileDTO {
    private String loginId;
    private String studentName;
    private String email;
    private String userRole;
    private String professorName;
    private String status;
    private Integer grade;
    private Integer semester;
    private Integer year;
    private String deptName;
    private Integer totalCredits;
}
