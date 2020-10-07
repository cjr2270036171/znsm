package com.znsm.znsm.service.serviceImpl;

import com.znsm.znsm.entity.Ztjm;
import com.znsm.znsm.mapper.IndexMapper;
import com.znsm.znsm.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public Ztjm index(Ztjm ztjm) {
        Ztjm a = indexMapper.index(ztjm);
        return a;
    }
}
