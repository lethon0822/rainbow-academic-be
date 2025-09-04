package com.rainbowuniv.academicmenagmentbe.lectures;

import com.rainbowuniv.academicmenagmentbe.lectures.model.LecturesEvaluationDto;
import com.rainbowuniv.academicmenagmentbe.professor.ProfessorMapper;
import com.rainbowuniv.academicmenagmentbe.lectures.model.EnrollStatusReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final ProfessorMapper professorMapper;

    //강의 평가 학생용
    public int studentSurvey(LecturesEvaluationDto dto) {
        int result = professorMapper.updateReview(dto);
        return result;
    }

    //수강 상태변경
    public int studentStatus(EnrollStatusReq req){
        return professorMapper.updateEnrollStatus(req);
    }
}
