package org.nuvola.myportal.server.repository;

import org.nuvola.oauth.provider.server.business.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
