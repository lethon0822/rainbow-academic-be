package com.rainbowuniv.academicmenagmentbe.staff.department.model;

import lombok.Getter;

import java.beans.ConstructorProperties;

@Getter
public class DepartmentPatchReq {
    private String status;
    private int deptId;

    @ConstructorProperties({"id", "status"})
    public DepartmentPatchReq(int deptId, String status){
        this.deptId = deptId;
        this.status = status;
    }
}
