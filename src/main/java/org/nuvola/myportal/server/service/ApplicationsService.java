package org.nuvola.myportal.server.service;

import java.security.Principal;
import java.util.List;

import org.nuvola.myportal.shared.vo.ApplicationVO;

public interface ApplicationsService {
    List<ApplicationVO> loadAll();

    List<ApplicationVO> loadAllowedApplications(Principal user);

    void createNew(ApplicationVO application);

    void update(ApplicationVO application);

    void delete(String clientID);
}
