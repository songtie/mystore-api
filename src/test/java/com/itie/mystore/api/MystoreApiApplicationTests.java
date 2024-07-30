package com.itie.mystore.api;

import com.itie.mystore.api.v1.entity.Banner;
import com.itie.mystore.api.v1.mapper.BannerMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MystoreApiApplicationTests {

    @Autowired
    private BannerMapper bannerMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testDataBaseInit(){
        Banner banner = bannerMapper.selectById(1);
        System.out.println(banner);
    }

}
