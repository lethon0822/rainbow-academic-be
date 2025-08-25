package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import com.rainbowuniv.academicmenagmentbe.sugang.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    public List<GradeBySubjectDTO> getGradesBySubject(Map<String, Object> params) {
        return gradeMapper.gradesbyCourse(params);
    }

    public List<CreditByCategoryDTO> getCreditByCategory(Map<String, Object> params) {
        return gradeMapper.selectCreditByCategory(params);
    }

    public List<SemesterGradeDTO> getSemesterGrades(Map<String, Object> params) {
        return gradeMapper.selectSemesterGradesByUser(params);
    }

    // --------------------------------- 성적 조회 부분 아래 코드로 전면 수정-------------------------------------//

    // 영구 성적 조회
    public List<GetAllGradesRes> getMyAllGrades(long userId, GetAllGradesReq getAllGradesReq) {

        // 이번 학기 찾기 ( 영구 성적 조회에서는 이번 학기 성적을 제외하기 위함 )


        List<GetAllGradesRes> getAllGradesRes = gradeMapper.getMyAllGrades(userId, getAllGradesReq);

        // res의 등급으로부터 평점 set 하기 위함
        for (GetAllGradesRes res : getAllGradesRes){
            String rank = res.getRank();
            double point;
            switch (rank){
                case "A+" -> point = 4.5;
                case "A"  -> point = 4.0;
                case "B+" -> point = 3.5;
                case "B"  -> point = 3.0;
                case "C+" -> point = 2.5;
                case "C"  -> point = 2.0;
                case "D+" -> point = 1.5;
                case "D"  -> point = 1.0;
                case "F"  -> point = 0.0;
                default   -> point = 0.0;
            }
            res.setPoint(point);

        }


        return  getAllGradesRes;
    }



}