package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.AppGetRes;
import com.rainbowuniv.academicmenagmentbe.application.model.AppPostReq;
import com.rainbowuniv.academicmenagmentbe.application.model.AppPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationMapper applicationMapper;

    public int insertAppForReason (AppPostReq req) {
        return applicationMapper.insertAppForReason(req);
    }

}
