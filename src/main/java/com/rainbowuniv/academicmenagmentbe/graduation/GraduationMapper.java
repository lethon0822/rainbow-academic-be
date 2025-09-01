package com.rainbowuniv.academicmenagmentbe.graduation;


import com.rainbowuniv.academicmenagmentbe.graduation.model.GraduationCheckDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GraduationMapper {


    List<GraduationCheckDTO> getMyCompletedCredits(int userId);
}
