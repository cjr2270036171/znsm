package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Cfov;
import com.znsm.znsm.mapper.CfovMapper;
import com.znsm.znsm.service.CfovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CfovServiceImpl implements CfovService {
    @Autowired
    CfovMapper cfovMapper;
    @Override
    public int addcfov(Cfov cfov) {
        int i = cfovMapper.addcfov(cfov);
        return i;
    }
}
