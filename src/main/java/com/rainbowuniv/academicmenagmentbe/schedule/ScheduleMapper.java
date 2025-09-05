package com.rainbowuniv.academicmenagmentbe.schedule;


import com.rainbowuniv.academicmenagmentbe.schedule.model.ScheduleCreateReq;
import com.rainbowuniv.academicmenagmentbe.schedule.model.ScheduleRes;
import com.rainbowuniv.academicmenagmentbe.schedule.model.ScheduleUpdateReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScheduleMapper {
    List<ScheduleRes> findByMonth(@Param("start") String start, @Param("end") String end);
    ScheduleRes findById(@Param("id") int id);
    int insert(ScheduleCreateReq req);
    int update(ScheduleUpdateReq req);
    int delete(@Param("id") int id);
    ScheduleRes findFor(@Param("semesterId") int semesterId, @Param("type") String type);
}