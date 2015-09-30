package org.nuvola.myportal.server.repository;

import org.nuvola.oauth.provider.server.business.Authority;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {
}
