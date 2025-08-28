package com.rainbowuniv.academicmenagmentbe.staff.department.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentGetReq {
    private String status;
    private String text;
}
