package org.nuvola.myportal.server.service.impl;

import java.security.Principal;
import java.util.List;

import org.nuvola.myportal.server.service.ApplicationsService;
import org.nuvola.myportal.shared.vo.ApplicationVO;
import org.nuvola.oauth.provider.repository.ApplicationRepository;
import org.nuvola.oauth.provider.repository.AuthorityRepository;
import org.nuvola.oauth.provider.repository.OAuthClientDetailsRepository;
import org.nuvola.oauth.server.security.SecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApplicationsServiceImpl implements ApplicationsService {
    private final ApplicationRepository applicationRepository;
    private final OAuthClientDetailsRepository oAuthClientDetailsRepository;
    private final SecurityContext securityContext;
    private final AuthorityRepository authorityRepository;

    @Autowired
    ApplicationsServiceImpl(ApplicationRepository applicationRepository,
                            OAuthClientDetailsRepository oAuthClientDetailsRepository,
                            SecurityContext securityContext,
                            AuthorityRepository authorityRepository) {
        this.applicationRepository = applicationRepository;
        this.oAuthClientDetailsRepository = oAuthClientDetailsRepository;
        this.securityContext = securityContext;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public List<ApplicationVO> loadAll() {
        return null;
    }

    @Override
    public List<ApplicationVO> loadAllowedApplications(Principal user) {
        return null;
    }

    @Override
    public void createNew(ApplicationVO application) {

    }

    @Override
    public void update(ApplicationVO application) {

    }

    @Override
    public void delete(String clientID) {

    }
}
