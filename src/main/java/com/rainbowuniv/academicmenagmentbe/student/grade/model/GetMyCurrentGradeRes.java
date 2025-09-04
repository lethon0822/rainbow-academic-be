package com.rainbowuniv.academicmenagmentbe.student.grade.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetMyCurrentGradeRes {
    private Long courseId;

    private String type;
    private String professorName;
    private String courseCode;
    private String title;
    private int credit;

    @JsonSerialize(nullsUsing = ScoreSerializer.class)
    private String rank;

    @JsonSerialize(using = ScoreSerializer.class, nullsUsing = ScoreSerializer.class)
    private Integer midScore;

    @JsonSerialize(using = ScoreSerializer.class, nullsUsing = ScoreSerializer.class)
    private Integer finScore;

    @JsonSerialize(using = ScoreSerializer.class, nullsUsing = ScoreSerializer.class)
    private Integer attendanceScore;

    @JsonSerialize(using = ScoreSerializer.class, nullsUsing = ScoreSerializer.class)
    private Integer otherScore;

    @JsonSerialize(using = ScoreSerializer.class, nullsUsing = ScoreSerializer.class)
    private Double point;




    // 강의평가를 했다면 진짜 성적을 알려주고, 강의평가를 안 했다면 OO 처리 하기 위함.
    private Integer evScore;
}
