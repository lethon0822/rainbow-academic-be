package com.rainbowuniv.academicmenagmentbe.account;

import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountFindIdRes;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginReq;
import com.rainbowuniv.academicmenagmentbe.account.model.AccountLoginRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {
   private final AccountMapper accountMapper;

   public AccountLoginRes login(AccountLoginReq req) {
      AccountLoginRes res = accountMapper.findByLoginId(req);
      return res;
   }

   // -------------------------------------------------------------

   // 여기에 암호화된 비밀번호 대조하는 뭐시기 만들 예정

   // -------------------------------------------------------------

   public AccountFindIdRes findIdByEmailAndPhone(AccountFindIdReq req) {
      AccountFindIdRes res = accountMapper.findIdByEmailAndPhone(req);
      return res;
   }

}
