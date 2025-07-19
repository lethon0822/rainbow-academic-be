package com.rainbowuniv.academicmenagmentbe.privacyandpwd;

import com.rainbowuniv.academicmenagmentbe.privacyandpwd.model.PwdPutReq;

public interface PwdMapper {
    int changePassword (PwdPutReq req);
}
