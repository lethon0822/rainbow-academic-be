package com.rainbowuniv.academicmenagmentbe.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class AttendanceDto {
    private LocalDate attendDate;
    private Date attendanceDate;
    private String status;
    private String note;
}
