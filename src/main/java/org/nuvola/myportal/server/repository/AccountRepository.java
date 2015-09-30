package org.nuvola.myportal.server.repository;

import org.nuvola.oauth.provider.server.business.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
