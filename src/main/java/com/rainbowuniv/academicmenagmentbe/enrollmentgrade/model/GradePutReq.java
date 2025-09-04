package com.rainbowuniv.academicmenagmentbe.enrollmentgrade.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GradePutReq {

    private int midScore;
    private int finScore;
    private String rank;
    private int scoreId;

    // 🔥 추가 (성적 관리 화면에 학년/학과 표시용)
    private int gradeYear;          // 학년
    private String departmentName;  // 학과명
    private String loginId;         // 학번
    private String userName;        // 이름
    private int enrollmentId;

}
