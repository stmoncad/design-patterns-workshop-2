package com.example.patterns_banking.services.commands;

import com.example.patterns_banking.models.Account;
import com.example.patterns_banking.repositories.IAccountRepository;
import java.util.List;

public class ListCommand implements ICommand<List<Account>> {
    private final IAccountRepository accountRepository;

    public ListCommand(IAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> execute() {
        return accountRepository.findAll();
    }
}
