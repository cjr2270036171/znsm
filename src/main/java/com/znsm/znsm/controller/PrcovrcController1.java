package com.znsm.znsm.controller;

import com.znsm.znsm.entity.Prcovrc;
import com.znsm.znsm.mapper.PrcovrcMapper;
import com.znsm.znsm.mapper.PrcovrcMapper1;
import com.znsm.znsm.service.PrcovrcService;
import com.znsm.znsm.service.PrcovrcService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PrcovrcController1 {

    @Autowired
    PrcovrcService1 prcovrcService1;

    @GetMapping("/addprcovrc1")
    public Map<String,Object> addprcovrc1(Prcovrc prcovrc){
        Map<String,Object> map = new HashMap<String,Object>();
        int i = prcovrcService1.addprcovrc1(prcovrc);
        map.put("code",i);
        map.put("msg","记录成功");
        return map;
    }

 /*   @GetMapping("/getAllindex")
    public Map<String,Object> getAllindex(){
        Map<String,Object> map = new HashMap<String,Object>();
        ArrayList<Vfcs> al = vfcsMapper.getAllindex();
        map.put("data",al);
        map.put("code",1);
        map.put("msg","查询成功");
        return map;
    }*/
}
