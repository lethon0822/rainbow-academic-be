package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplicationMapper {
    int insertAppForReason(AppPostReq req);

    int insertApplication(@Param("userId") Long userId,
                          @Param("scheduleId") Integer scheduleId,
                          @Param("reason") String reason);

    Integer selectNextSemesterId(@Param("currentSemesterId") Integer currentSemesterId);

    ScheduleWindow selectScheduleForSemesterAndType(@Param("semesterId") Integer semesterId,
                                                    @Param("scheduleType") String scheduleType);

    Integer isScheduleOpenNow(@Param("scheduleId") Integer scheduleId);

    List<ApplicationListRow> selectMyApplications(@Param("userId") Long userId,
                                                  @Param("status") String status);
}
