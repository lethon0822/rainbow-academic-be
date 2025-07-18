package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PrivacyPutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrivacyMapper {
    int updateMyPrivacy(PrivacyPutReq req);
}
