package com.rainbowuniv.academicmenagmentbe.student.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //기본 생성자 생성
@AllArgsConstructor //모든 필드 받는 생성자 생성
public class SugangRes {
    private String message; // ex) 수강 신청 완료
    private int courseId;
    private String title;
    private String classroom;
    private String professor;
    private String time;
    private int credit;
}
