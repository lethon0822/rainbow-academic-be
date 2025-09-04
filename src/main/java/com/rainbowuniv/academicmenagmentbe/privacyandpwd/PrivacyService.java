package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PrivacyService {
    private final PrivacyMapper privacyMapper;

    public PrivacyGetRes selectMyPrivacy(int loginId) {
        return privacyMapper.selectMyPrivacy(loginId);
    }

    public int updateMyPrivacy (PrivacyPutReq req) {
        return privacyMapper.updateMyPrivacy(req);
    }

//    public int updateMyPwd (PwdPutReq req) {
//        String hashedPw = BCrypt.hashpw(req.getPassword(), BCrypt.gensalt());
//        PwdPutReq result = new PwdPutReq(req.getLoginId(), req.getEmail(), hashedPw);
//        return privacyMapper.updateMyPwd(result);
//    }
}