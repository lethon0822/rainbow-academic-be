package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class GradeSearchReq {
    private String userId;
    private Integer year;
    private Integer semester;
    private Date createdAt;
}

