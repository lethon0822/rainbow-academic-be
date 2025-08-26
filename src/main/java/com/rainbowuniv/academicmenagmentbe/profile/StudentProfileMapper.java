package com.rainbowuniv.academicmenagmentbe.profile;

import com.rainbowuniv.academicmenagmentbe.profile.model.StudentProfileInfoRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentProfileMapper {
    StudentProfileInfoRes findStudentProfileInfo(long userId);
}
