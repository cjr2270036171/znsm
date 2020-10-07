package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Tsxs;
import com.znsm.znsm.mapper.TsxsMapper;
import com.znsm.znsm.service.TsxsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TsxsController {

    @Autowired
    TsxsService  tsxsService;

    @GetMapping("/tsxslogin")
    public Map<String,Object> tsxslogin(){
        Map<String,Object> map = new HashMap<String,Object>();
        ArrayList<Tsxs> al = tsxsService.tsxslogin();
        map.put("data",al);
        map.put("code",1);
        map.put("msg","查询成功");
        return map;
    }
}
