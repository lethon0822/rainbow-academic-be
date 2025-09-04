package com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PrivacyPutReq;
import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PwdPutReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public int updateMyPwd(PwdPutReq req) {
        // 들어온 요청 값 확인
        log.info("요청된 이메일: {}", req.getEmail());
        log.info("요청된 비밀번호(평문): {}", req.getPassword());

        // 비밀번호 해시 처리
        String hashedPw = BCrypt.hashpw(req.getPassword(), BCrypt.gensalt());
        log.info("해시된 비밀번호: {}", hashedPw);

        // 새 DTO 생성
        PwdPutReq result = new PwdPutReq(req.getEmail(), hashedPw);

        // DB 업데이트 실행
        int updateCount = privacyMapper.updateMyPwd(result);
        log.info("업데이트 결과 건수: {}", updateCount);

        return updateCount;
    }
}