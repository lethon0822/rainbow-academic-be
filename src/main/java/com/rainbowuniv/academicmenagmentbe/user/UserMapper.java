package com.rainbowuniv.academicmenagmentbe.user;


import com.rainbowuniv.academicmenagmentbe.user.model.UserDto;
import com.rainbowuniv.academicmenagmentbe.user.model.UserGetRes;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper

public interface UserMapper {


    UserGetRes selectAcademicInfo(int userId);


    UserGetRes selectStudentAcademicInfo(int userId);
}
