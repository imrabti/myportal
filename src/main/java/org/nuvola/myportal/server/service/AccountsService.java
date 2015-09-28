package org.nuvola.myportal.server.service;

import org.nuvola.myportal.shared.vo.AccountVO;

public interface AccountsService {
    void loadAccountForUser(Long userId);

    void createNewAccount(Long userId, AccountVO account);

    void deleteAccount(Long id);
}
