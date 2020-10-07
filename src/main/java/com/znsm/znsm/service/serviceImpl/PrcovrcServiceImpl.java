package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Prcovrc;
import com.znsm.znsm.mapper.PrcovrcMapper;
import com.znsm.znsm.service.PrcovrcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrcovrcServiceImpl implements PrcovrcService {

    @Autowired
    PrcovrcMapper prcovrcMapper;

    @Override
    public int addprcovrc(Prcovrc prcovrc) {
        int i = prcovrcMapper.addprcovrc(prcovrc);
        return i;
    }
}
