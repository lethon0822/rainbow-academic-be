package com.rainbowuniv.academicmenagmentbe.application;

import com.rainbowuniv.academicmenagmentbe.application.model.AppPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicationService {
    private final ApplicationMapper applicationMapper;

    public int insertAppForReason (AppPostReq req) {
        return applicationMapper.insertAppForReason(req);
    }

}
