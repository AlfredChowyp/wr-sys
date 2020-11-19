package com.alfred.wrsys.web;

import com.alfred.wrsys.core.Result;
import com.alfred.wrsys.core.ResultGenerator;
import com.alfred.wrsys.model.User;
import com.alfred.wrsys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "v1/login")
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User loginUser = userService.login(username, password);
        if (null == loginUser) {
            return ResultGenerator.genFailResult("false");
        }
        return ResultGenerator.genSuccessResult(loginUser);
    }
}
