package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeDTO {
    private int grade ;
    private int semester;
    private int courseId;
    private String title;
    private int credit;
    private String rank;
    private String type;
}

