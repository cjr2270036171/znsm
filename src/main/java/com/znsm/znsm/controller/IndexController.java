package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Ztjm;
import com.znsm.znsm.mapper.IndexMapper;
import com.znsm.znsm.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin //允许跨域
@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @GetMapping("/index")
    public Map<String,Object> log1(Ztjm ztjm){
        Map<String,Object> map = new HashMap<String,Object>();
        Ztjm a = indexService.index(ztjm);
        System.out.println(a);
        if (a == null){
            map.put("code",0);
            map.put("msg","连接失败，请重新填写");
        }else {
            map.put("code",1);
            map.put("msg","连接成功");
        }
        return map;
    }
}
