package com.rainbowuniv.academicmenagmentbe.grade.model;

import lombok.Data;

@Data
public class CreditByCategoryDTO {
    private int grade;          // 학년
    private String semester;    // 학기
    private int majorRequired;  // 전공필수 학점 총합
    private int majorElective;  // 전공선택 학점 총합
    private int generalEducation; // 교양 학점 총합
}
