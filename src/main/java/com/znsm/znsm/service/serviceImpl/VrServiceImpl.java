package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Vr;
import com.znsm.znsm.mapper.VrMapper;
import com.znsm.znsm.service.VrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VrServiceImpl implements VrService {

    @Autowired
    VrMapper vrMapper;
    @Override
    public int addvr(Vr vr) {
        int i = vrMapper.addvr(vr);
        return i;
    }
}
