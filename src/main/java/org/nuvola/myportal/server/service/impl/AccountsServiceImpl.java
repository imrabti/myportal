package org.nuvola.myportal.server.service.impl;

import org.nuvola.myportal.server.service.AccountsService;
import org.nuvola.myportal.shared.vo.AccountVO;
import org.nuvola.oauth.provider.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountsServiceImpl implements AccountsService {
    private final AccountRepository accountRepository;

    @Autowired
    AccountsServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void loadAccountForUser(Long userId) {

    }

    @Override
    public void createNewAccount(Long userId, AccountVO account) {

    }

    @Override
    public void deleteAccount(Long id) {

    }
}
