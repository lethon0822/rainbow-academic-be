package com.rainbowuniv.academicmenagmentbe.student.graduation;


import com.rainbowuniv.academicmenagmentbe.student.graduation.model.GraduationCheckDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GraduationMapper {


    List<GraduationCheckDTO> getMyCompletedCredits(int userId);
}
