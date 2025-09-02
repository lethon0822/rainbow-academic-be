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

   public String encodePassword(String rawPassword) {
      return BCrypt.hashpw(rawPassword, BCrypt.gensalt());
   }

   // 비밀번호 일치 여부 검사
   public boolean matchesPassword(String rawPassword, String storedPassword) {
      // bcrypt로 암호화된 비밀번호는 항상 $2a$ / $2b$ / $2y$ 로 시작
      boolean isBcrypt = storedPassword.startsWith("$2a$")
              || storedPassword.startsWith("$2b$")
              || storedPassword.startsWith("$2y$");

      if (isBcrypt) {
         // bcrypt 비교
         return BCrypt.checkpw(rawPassword, storedPassword);
      } else {
         // 초기 비밀번호(평문) 비교
         return storedPassword.equals(rawPassword);
      }
   }

   // -------------------------------------------------------------

   public AccountFindIdRes findIdByEmailAndPhone(AccountFindIdReq req) {
      AccountFindIdRes res = accountMapper.findIdByEmailAndPhone(req);
      return res;
   }

}
