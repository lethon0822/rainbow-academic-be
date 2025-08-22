package com.rainbowuniv.academicmenagmentbe.staff.department.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentPutReq {
    private int deptId;
    private int headProfId;
    private String deptName;
    private String deptOffice;
    private String deptTel;
    private int deptMaxStd;
    private String deptCode;

}
