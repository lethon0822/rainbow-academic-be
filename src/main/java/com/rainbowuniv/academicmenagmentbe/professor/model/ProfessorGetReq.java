package com.rainbowuniv.academicmenagmentbe.professor.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class ProfessorGetReq {
    private int userId;
    private int semesterId;


}
