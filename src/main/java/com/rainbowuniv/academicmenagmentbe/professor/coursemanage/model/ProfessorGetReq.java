package com.rainbowuniv.academicmenagmentbe.professor.coursemanage.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ProfessorGetReq {
    private Integer userId;
    private Integer year;
    private Integer semester;
    private Integer sid;




}
