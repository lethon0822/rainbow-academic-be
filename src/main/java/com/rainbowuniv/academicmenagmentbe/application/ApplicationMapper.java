package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.AppGetRes;
import com.rainbowuniv.academicmenagmentbe.application.model.AppPostReq;
import com.rainbowuniv.academicmenagmentbe.application.model.AppPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplicationMapper {
    int insertAppForReason(AppPostReq req);

}
