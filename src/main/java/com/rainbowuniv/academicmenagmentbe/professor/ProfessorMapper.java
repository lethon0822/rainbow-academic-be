package com.rainbowuniv.academicmenagmentbe.professor;


import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessorMapper {

    int saveCourse(ProfessorPostReq req);

    List<ProfessorGetRes> findByUserId(ProfessorGetReq req);

    int modify(ProfessorPutReq req);

    List<CourseStudentGetReq> findStudentsByUserId(int courseId);

    //학과조회
    String findDeptNameByUserId(int userId);

    //강의평가 조회
    List<ProfessorSurveyCheckRes> findSurveyByCourseId(int courseId);

    //강의평가 학생용
    int updateReview(LecturesEvaluationDto dto);
}
