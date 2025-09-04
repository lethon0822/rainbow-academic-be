package com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PrivacyPutReq;
import com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.model.PwdPutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrivacyMapper {
    PrivacyGetRes selectMyPrivacy(int userId);
    int updateMyPrivacy(PrivacyPutReq req);
    int updateMyPwd(PwdPutReq req);
}
