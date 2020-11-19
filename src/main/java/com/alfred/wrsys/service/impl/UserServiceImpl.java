package com.alfred.wrsys.service.impl;

import com.alfred.wrsys.dao.UserMapper;
import com.alfred.wrsys.model.User;
import com.alfred.wrsys.service.UserService;
import com.alfred.wrsys.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/11/10.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {

        return userMapper.login(username, password);
    }
}
