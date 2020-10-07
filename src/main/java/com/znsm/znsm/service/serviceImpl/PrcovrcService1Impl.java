package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Prcovrc;
import com.znsm.znsm.mapper.PrcovrcMapper1;
import com.znsm.znsm.service.PrcovrcService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrcovrcService1Impl implements PrcovrcService1 {

    @Autowired
    PrcovrcMapper1 prcovrcMapper1;

    @Override
    public int addprcovrc1(Prcovrc prcovrc) {
        int i = prcovrcMapper1.addprcovrc1(prcovrc);
        return i;
    }
}
