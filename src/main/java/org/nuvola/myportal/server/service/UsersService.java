package org.nuvola.myportal.server.service;

import java.util.List;

import org.nuvola.myportal.shared.vo.UserVO;

public interface UsersService {
    List<UserVO> loadAll();

    void createNew(UserVO user);

    void update(UserVO user);

    void delete(Long id);
}
