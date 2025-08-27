package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.AppPostReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplicationMapper {
    int insertAppForReason(AppPostReq req);

}
