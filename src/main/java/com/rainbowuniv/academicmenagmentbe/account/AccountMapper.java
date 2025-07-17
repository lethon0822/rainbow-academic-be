package com.rainbowuniv.academicmenagmentbe.account;

import com.rainbowuniv.academicmenagmentbe.account.model.AccountIDReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface AccountMapper {
    AccountLoginRes findByLoginId(AccountLoginReq req);
    List<AccountIDReq> findByDeptId();
}
