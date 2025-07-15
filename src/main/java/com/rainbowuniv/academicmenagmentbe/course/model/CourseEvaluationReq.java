package com.rainbowuniv.academicmenagmentbe.course.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseEvaluationReq {
    //강의 평가 요청 모델
    //유저Id,courseId,year,semester
    private int userId;
    private int courseId;
    private String year;
    private String semester;

 /* private int 평점 받을 거면
    private int contentRating;      // 강의 내용 평점 (1-5)
    private int teachingRating;     // 강의 방식 평점 (1-5)
    private int difficultyRating;   // 난이도 평점 (1-5)
 * */
    /* 의견 - private String comment 필요*/
}
