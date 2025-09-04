package com.rainbowuniv.academicmenagmentbe.shared.schedule;


import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleCreateReq;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleRes;
import com.rainbowuniv.academicmenagmentbe.shared.schedule.model.ScheduleUpdateReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleMapper mapper;

    @Override
    public List<ScheduleRes> findByMonth(int year, int month) {
        LocalDate first = LocalDate.of(year, month, 1);
        LocalDate last  = first.withDayOfMonth(first.lengthOfMonth());
        String start = first + " 00:00:00";
        String end   = last  + " 23:59:59";
        return mapper.findByMonth(start, end);
    }

    @Override
    public ScheduleRes findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public void create(ScheduleCreateReq req) {
        validateRange(req.getStartDate(), req.getEndDate());
        mapper.insert(req);
    }

    @Override
    public void update(ScheduleUpdateReq req) {
        validateRange(req.getStartDate(), req.getEndDate());
        mapper.update(req);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }

    private void validateRange(String start, String end) {
        if (LocalDate.parse(start).isAfter(LocalDate.parse(end))) {
            throw new IllegalArgumentException("시작일이 종료일보다 늦습니다.");
        }
    }
}
