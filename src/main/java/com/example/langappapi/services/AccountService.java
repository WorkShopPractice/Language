package com.example.langappapi.services;

import com.example.langappapi.domains.Account;
import com.example.langappapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
   @Autowired
    private AccountRepository accountRepository;
      // error for accountRepository would have persist if @Repository beans not included in the AccountRespository class

  public Account createAccount(Account account){
       return accountRepository.save(account);
       // save works only when the AccountRepository interface with the Account
   }


}
