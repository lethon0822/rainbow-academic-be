package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyGetRes;
import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrivacyMapper {
    PrivacyGetRes selectMyPrivacy(int loginId);
    int updateMyPrivacy(PrivacyPutReq req);
}
