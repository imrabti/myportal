package org.nuvola.myportal.server.service.impl;

import java.util.List;

import org.nuvola.myportal.server.repository.UserRepository;
import org.nuvola.myportal.server.service.UsersService;
import org.nuvola.myportal.shared.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    private final UserRepository userRepository;

    @Autowired
    UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserVO> loadAll() {
        return null;
    }

    @Override
    public void createNew(UserVO user) {

    }

    @Override
    public void update(UserVO user) {

    }

    @Override
    public void delete(Long id) {

    }
}
