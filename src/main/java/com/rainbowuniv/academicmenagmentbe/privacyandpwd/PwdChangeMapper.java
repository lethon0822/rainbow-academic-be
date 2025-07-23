package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PwdChangeMapper {
    int changePwdById (PwdPutReq req);
}
