package com.rainbowuniv.academicmenagmentbe.grade;

import com.rainbowuniv.academicmenagmentbe.grade.model.GradeDTO;
import com.rainbowuniv.academicmenagmentbe.grade.model.GradeSearchReq;
import com.rainbowuniv.academicmenagmentbe.student.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private StudentMapper studentMapper;

    public List<GradeDTO> findBySimpleGrade(GradeSearchReq p) {
        return studentMapper.studentFindById(p);
    }
}

