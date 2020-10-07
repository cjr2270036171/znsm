package com.znsm.znsm.mapper;//package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Login;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    public Login allLogin(Login login);

    public int  add_login(Login login);

    public Login  loginByUser(String username);
}
