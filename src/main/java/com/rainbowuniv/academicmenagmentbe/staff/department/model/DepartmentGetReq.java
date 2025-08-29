package com.rainbowuniv.academicmenagmentbe.staff.department.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class DepartmentGetReq {
    private String status;
    private String keyword;
}
