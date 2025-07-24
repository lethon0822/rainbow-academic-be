package com.rainbowuniv.academicmenagmentbe.sugang;

import com.rainbowuniv.academicmenagmentbe.grade.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    // 성적조회(간소)
    List<GradeDTO> studentFindById(GradeSearchReq p);
}