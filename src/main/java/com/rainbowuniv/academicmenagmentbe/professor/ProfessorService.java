package com.rainbowuniv.academicmenagmentbe.professor;


import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProfessorService {
    private final ProfessorMapper professorMapper;

    public int saveCourse(ProfessorPostReq req) {
        return professorMapper.saveCourse(req);
    }

    public List<ProfessorGetRes> findMyCourse(ProfessorGetReq req) {
        return professorMapper.findByUserId(req);
    }

    public int modify(ProfessorPutReq req) {
        return professorMapper.modify(req);
    }

    public List<CourseStudentGetReq> courseStudentList(int courseId) {
        return professorMapper.findStudentsByUserId(courseId);
    }

    //강의 평가 학생용
    public int studentSurvey(LecturesEvaluationDto dto) {
        return professorMapper.createStudentSurvey(dto);
    }
}
