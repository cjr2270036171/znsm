package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Cfov;
import com.znsm.znsm.entity.Vfcs;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CfovMapper {
    //插入
    public int addcfov(Cfov cfov);
}
