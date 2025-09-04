package com.rainbowuniv.academicmenagmentbe.professor.coursemanage.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class ProfessorGetReq {
    private int userId;
    private int semesterId;


}
