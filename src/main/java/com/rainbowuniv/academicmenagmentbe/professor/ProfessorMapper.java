package com.rainbowuniv.academicmenagmentbe.professor;


import com.rainbowuniv.academicmenagmentbe.professor.model.ProfessorGetReq;
import com.rainbowuniv.academicmenagmentbe.professor.model.ProfessorGetRes;
import com.rainbowuniv.academicmenagmentbe.professor.model.ProfessorPostReq;
import com.rainbowuniv.academicmenagmentbe.professor.model.ProfessorPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessorMapper {

    int saveCourse(ProfessorPostReq req);

    List<ProfessorGetRes> findByUserId(ProfessorGetReq req);

    int modify(ProfessorPutReq req);
}
