package com.rainbowuniv.academicmenagmentbe.professor.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProfessorGetReq {
    private int userId;
    private int year;
    private int semester;


}
