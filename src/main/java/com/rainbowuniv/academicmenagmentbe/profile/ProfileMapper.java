package com.rainbowuniv.academicmenagmentbe.profile;

import com.rainbowuniv.academicmenagmentbe.profile.model.ProfileDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProfileMapper {
    // 학생 프로필
    ProfileDTO selectStudentProfile(String loginId);
}
