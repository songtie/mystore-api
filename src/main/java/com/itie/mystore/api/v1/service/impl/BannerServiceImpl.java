package com.itie.mystore.api.v1.service.impl;

import com.itie.mystore.api.v1.entity.Banner;
import com.itie.mystore.api.v1.mapper.BannerMapper;
import com.itie.mystore.api.v1.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bannerService")
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> findAll() {
        return bannerMapper.selectList(null);
    }
}
