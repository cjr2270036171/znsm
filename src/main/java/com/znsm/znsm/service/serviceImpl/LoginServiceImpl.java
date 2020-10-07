package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Login;
import com.znsm.znsm.mapper.LoginMapper;
import com.znsm.znsm.service.LoginService;
import com.znsm.znsm.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public Login allLogin(Login login) {
        //处理密码
        login.setPassword(MD5Util.md5(login.getPassword()));

        Login a = loginMapper.allLogin(login);
        return a;
    }

    @Override
    public int add_login(Login login) {
        //处理密码
        login.setPassword(MD5Util.md5(login.getPassword()));

        int i = loginMapper.add_login(login);
        return i;
    }

    @Override
    public Login loginByUser(String usernmae) {

        Login a = loginMapper.loginByUser(usernmae);
        return a;
    }
}
