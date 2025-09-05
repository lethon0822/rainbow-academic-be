package com.rainbowuniv.academicmenagmentbe.semester;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

// mapper
@Mapper
public interface SemesterMapper {
    Integer findNextSemesterId(@Param("id") int id);
}