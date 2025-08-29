package com.rainbowuniv.academicmenagmentbe.staff.department.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.beans.ConstructorProperties;

@Getter

public class DepartmentPatchReq {
    private String status = "0";
    private int deptId;


    public DepartmentPatchReq(int deptId){
        this.deptId = deptId;
    }
}
