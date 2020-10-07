package com.znsm.znsm.service;

import com.znsm.znsm.entity.Login;

public interface LoginService {

    public Login allLogin(Login login);

    public int add_login(Login login);

    public Login loginByUser(String usernmae);
}
