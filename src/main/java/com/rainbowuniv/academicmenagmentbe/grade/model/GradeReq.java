package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GradeReq {
    //성적 조회 : 학생 Id, 년도, 학기
    private int userId;
    private String year;
    private String semester;
}

