package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Vfcs;
import com.znsm.znsm.entity.Vr;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VrMapper {
    //插入
    public int addvr(Vr vr);
}
