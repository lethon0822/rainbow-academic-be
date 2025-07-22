package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PwdChangeService {
    private final PwdChangeMapper pwdChangeMapper;

//    public int changePwdById (PwdPutReq req) {
//        String hashedPw = BCrypt.hashpw(req.getPassword(), BCrypt.gensalt());
//        PwdPutReq changeReq = new PwdPutReq(req.getUserId(), hashedPw);
//        return pwdChangeMapper.changePwdById(changeReq);
//    }
}
