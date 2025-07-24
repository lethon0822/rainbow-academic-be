package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeMapper {

    // 성적 조회 (간단 조회용)
    List<GradeDTO> findBySimpleGrade(GradeSearchReq searchReq);

    // 성적 전체 조회
    List< GradeBySubjectDTO > gradesbyCourse(int userId, int courseId, int semester);
    List< CreditByCategoryDTO > selectCreditByCategory(int userId, int courseId, int semester);
    List< SemesterGradeDTO > selectSemesterGradesByUser(int userId, int courseId, int semester);

    // 성적 등록/수정

}
