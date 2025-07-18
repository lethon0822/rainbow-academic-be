package com.rainbowuniv.academicmenagmentbe.account;

import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdRes;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginRes;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AccountMapper {
    AccountLoginRes findByLoginId(AccountLoginReq req);
    AccountFindIdRes findIdByEmailAndPhone(AccountFindIdReq req);

}
