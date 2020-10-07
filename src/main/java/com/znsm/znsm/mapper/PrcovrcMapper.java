package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Prcovrc;
import com.znsm.znsm.entity.Vfcs;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PrcovrcMapper {
    //插入
    public int addprcovrc(Prcovrc prcovrc);
    //查询
    /*public ArrayList<Vfcs> getAllindex();*/
}
