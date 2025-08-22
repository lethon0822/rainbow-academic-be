package com.rainbowuniv.academicmenagmentbe.staff.department.model;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DepartmentPostReq {
    private String deptName;
    private String deptOffice;
    private String deptTel;
    private String deptMaxStd;
    private String deptCode;
}
