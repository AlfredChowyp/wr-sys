package com.alfred.wrsys.dao;

import com.alfred.wrsys.core.Mapper;
import com.alfred.wrsys.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends Mapper<User> {

    User login(@Param("username") String username, @Param("password") String password);
}