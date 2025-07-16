package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeDTO {
    private String type;
    private int courseId;
    private String title;
    private int semester;
    private int credit;
    private String grade;
    private Date createdAt;
}

