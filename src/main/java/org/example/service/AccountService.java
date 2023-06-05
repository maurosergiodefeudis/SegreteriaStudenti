package org.example.service;

import com.exercise.mauro.openapidemo.api.model.Accounts;
import org.example.model.Account;
import org.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Accounts retrieveAllStudents() {
        List<Account> retrievedAccounts = new ArrayList<Account>(){{
            accountRepository.findAll().forEach(this::add);
        }};

        if (retrievedAccounts.isEmpty())
            return null;

        Accounts accounts = new Accounts();

        for (Account account: retrievedAccounts){
            com.exercise.mauro.openapidemo.api.model.Account outputAccount = new com.exercise.mauro.openapidemo.api.model.Account();
            outputAccount.setNome(account.getNome());
            outputAccount.setCognome(account.getCognome());
            outputAccount.setDataDiNascita(account.getDataDiNascita());
            outputAccount.setCF(account.getCF());
            outputAccount.setMatricola(account.getMatricola());
            accounts.add(outputAccount);
        }
        return accounts;
    }
}
