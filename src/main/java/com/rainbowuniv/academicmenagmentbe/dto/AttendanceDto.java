package com.rainbowuniv.academicmenagmentbe.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AttendanceDto {
    private int userId;
    private Date attendanceDate;
    private String status;
    private String note;
}
