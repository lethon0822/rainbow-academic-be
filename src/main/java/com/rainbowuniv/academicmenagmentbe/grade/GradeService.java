package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GradeService {

    private final GradeMapper gradeMapper;

    public void updateGrade(GradeUpdateReq req) {
        gradeMapper.updateGrade(req);
    }
}
