package com.alfred.wrsys.service;
import com.alfred.wrsys.model.User;
import com.alfred.wrsys.core.Service;


/**
 * Created by CodeGenerator on 2020/11/10.
 */
public interface UserService extends Service<User> {

    User login(String username, String password);

}
