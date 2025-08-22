package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class GetAllGradesRes {
    private int year;
    private int semester;
    private String type;
    private int grade;
    private String professor;
    private String courseCode;
    private String title;
    private int credit;
    private String rank;
    private double point; // 평점 4.5, 4.0 ...
    private int myRank; //어떤 강의에 대한 내 등수
    private int totalStudents; // 강의 수강 전체 인원

}
