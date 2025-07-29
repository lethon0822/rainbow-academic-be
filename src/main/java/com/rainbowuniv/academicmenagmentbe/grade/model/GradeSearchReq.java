package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Data
public class GradeSearchReq {
    private String userId;
    private Integer year;
    private Integer semester;
    private Date createdAt;
}

