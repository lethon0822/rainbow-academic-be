package com.rainbowuniv.academicmenagmentbe.sugang;


import com.rainbowuniv.academicmenagmentbe.sugang.model.MySugangListRes;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangReq;
import com.rainbowuniv.academicmenagmentbe.sugang.model.SugangRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class SugangService {
    private final SugangMapper sugangMapper;

    public int enrollment(SugangReq req) {
        return sugangMapper.courseEnrollment(req);
    }

    public SugangRes sugangCourseInfo(SugangReq req) {
        return sugangMapper.sugangCourseInfo(req);
    }

    public List<MySugangListRes> findAppliedCoursesByUserId(int userId, int year, int semester){
        return sugangMapper.findAppliedCoursesByUserId(userId, year, semester);
    }

    public int remMinus1(SugangReq req) {
        return sugangMapper.decreaseRemainingSeats(req);
    }

    public int checkRemainingSeats(SugangReq req) {
        return sugangMapper.getRemainingSeats(req);
    }

    public int sugangCancel(int courseId, int userId){
        return  sugangMapper.sugangCancel(courseId, userId);
    }

    public int remPlus1(int courseId){return sugangMapper.increaseRemainingSeats(courseId);}



}
