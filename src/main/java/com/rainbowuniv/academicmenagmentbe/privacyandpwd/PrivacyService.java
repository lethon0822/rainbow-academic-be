package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrivacyService {
    private final PrivacyMapper privacyMapper;

    public int updateMyPrivacy (PrivacyPutReq req) {
        return privacyMapper.updateMyPrivacy(req);
    }
}
