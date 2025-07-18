package com.rainbowuniv.academicmenagmentbe.user;


import com.rainbowuniv.academicmenagmentbe.user.model.UserDto;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface UserMapper {
    int save(UserDto dto);

    UserDto selectAcademicInfo(int userId);


    UserDto selectStudentAcademicInfo(int userId);
}
