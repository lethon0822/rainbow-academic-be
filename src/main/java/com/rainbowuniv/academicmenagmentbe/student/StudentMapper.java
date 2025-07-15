package com.rainbowuniv.academicmenagmentbe.student;

import com.rainbowuniv.academicmenagmentbe.student.model.StudentReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    // 학생 조회
    int studentFindById(StudentReq p);
}

