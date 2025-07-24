package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import com.rainbowuniv.academicmenagmentbe.sugang.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradeMapper gradeMapper;
    private final StudentMapper studentMapper;

    // 성적 간단 조회
    public List<GradeDTO> findBySimpleGrade(GradeSearchReq searchReq) {
        return studentMapper.studentFindById(searchReq);
    }

    // 성적 전체 조회
    public List<GradeBySubjectDTO>  getGradesBySubject(int userId, int courseId, int semester) {
        return gradeMapper.gradesbyCourse(userId, courseId, semester );
    }

    public List<CreditByCategoryDTO> getCreditByCategory(int userId, int courseId, int semester) {
        return gradeMapper.selectCreditByCategory(userId, courseId, semester);
    }

    public List<SemesterGradeDTO> getSemesterGrades(int userId, int courseId, int semester) {
        return gradeMapper.selectSemesterGradesByUser(userId, courseId, semester);
    }

}