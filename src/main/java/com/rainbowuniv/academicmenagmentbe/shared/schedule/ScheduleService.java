package com.rainbowuniv.academicmenagmentbe.shared.schedule;



import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleCreateReq;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleRes;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleUpdateReq;

import java.util.List;

public interface ScheduleService {
    ScheduleRes findFor(int semesterId, String type);
    List<ScheduleRes> findByMonth(int year, int month);
    ScheduleRes findById(int id);
    void create(ScheduleCreateReq req);
    void update(ScheduleUpdateReq req);
    void delete(int id);
}