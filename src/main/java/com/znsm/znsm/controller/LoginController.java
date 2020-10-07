package com.znsm.znsm.controller;//package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Login;
import com.znsm.znsm.mapper.LoginMapper;
import com.znsm.znsm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public Map<String,Object> allLogin(Login login){
        Map<String,Object> map = new HashMap<String,Object>();
        Login a = loginService.allLogin(login);
        System.out.println(a);
        if (a == null){
            map.put("code",0);
            map.put("msg","登录失败，用户名密码错误");
        }else {
            map.put("code",1);
            map.put("msg","登录成功");
        }
        return map;
    }

    @GetMapping("/addlogin")
    public Map<String,Object> add_login(Login login){
        Map<String,Object> map = new HashMap<String,Object>();

        Login a = loginService.loginByUser(login.getUsername());

        System.out.println(a);
            if (a == null){
                int  i = loginService.add_login(login);
                map.put("code",i);
                map.put("msg","插入成功");
            }else {
                map.put("code",0);
                map.put("msg","用户名存在");
            }
        return map;
    }

}
