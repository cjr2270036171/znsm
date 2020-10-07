package com.znsm.znsm;

import com.znsm.znsm.entity.Login;
import com.znsm.znsm.entity.Ztjm;
import com.znsm.znsm.mapper.IndexMapper;
import com.znsm.znsm.mapper.LoginMapper;
import com.znsm.znsm.service.LoginService;
import org.assertj.core.data.Index;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ZnsmApplicationTests {

    @Autowired
    IndexMapper indexMapper;

    @Test
    void contextLoads() {
        ArrayList<Ztjm> a = indexMapper.cs();
        System.out.println(a);


    }

}
