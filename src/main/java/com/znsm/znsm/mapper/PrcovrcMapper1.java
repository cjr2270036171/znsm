package com.znsm.znsm.mapper;

import com.znsm.znsm.entity.Prcovrc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrcovrcMapper1 {
    //插入
    public int addprcovrc1(Prcovrc prcovrc);
    //查询
    /*public ArrayList<Vfcs> getAllindex();*/
}
