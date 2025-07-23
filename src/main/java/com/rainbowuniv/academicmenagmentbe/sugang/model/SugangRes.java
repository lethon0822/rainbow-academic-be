package com.rainbowuniv.academicmenagmentbe.sugang.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor //기본 생성자 생성
@AllArgsConstructor //모든 필드 받는 생성자 생성
public class SugangRes {
    private int courseId; //과목 코드
    private String title; //강의 이름
    private String classroom; //강의실
    private String type; //이수 구분
    private String professorName; //담당 교수
    private int grade; //수강 학년
    private int year; //연도
    private int semester; // 학기
    private String time; // 강의시간
    private int credit; // 학점
    private int maxStd; // 정원
    private int remStd; //잔여 인원
}
