package fev.management.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fev.management.entity.FevAccount;
import fev.management.repository.AccountRepository;

@Repository
@Transactional
@org.springframework.stereotype.Service
public class UserService  {

    @Autowired
    private AccountRepository accountRepository;


    public FevAccount getUserbyUsername(String username) {

        return null;
    }

    public boolean checkLogin(String username, String password) {
        FevAccount account = accountRepository.checkLogin(username, password);
        if(account != null)
            return true;
        return false;
    }

}
