package com.rainbowuniv.academicmenagmentbe.student.profile;

import com.rainbowuniv.academicmenagmentbe.student.profile.model.StudentProfileInfoRes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentProfileMapper {
    StudentProfileInfoRes findStudentProfileInfo(long userId);
}
