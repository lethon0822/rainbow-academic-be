package com.rainbowuniv.academicmenagmentbe.student;


import com.rainbowuniv.academicmenagmentbe.student.model.SugangListRes;
import com.rainbowuniv.academicmenagmentbe.student.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.student.model.SugangRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SugangService {
    private final SugangMapper sugangMapper;

    public int enrollment(SugangReq req) {
        return sugangMapper.courseEnrollment(req);
    }

    public SugangRes sugangCourseInfo(SugangReq req) {
        return sugangMapper.sugangCourseInfo(req);
    }

    public List<SugangListRes> findAppliedCoursesByUserId(int userId, int year, int semester){
        return sugangMapper.findAppliedCoursesByUserId(userId, year, semester);
    }

    public int remMinus1(SugangReq req) {
        return sugangMapper.decreaseRemainingSeats(req);
    }

    public int checkRemainingSeats(SugangReq req) {
        return sugangMapper.getRemainingSeats(req);
    }



}
