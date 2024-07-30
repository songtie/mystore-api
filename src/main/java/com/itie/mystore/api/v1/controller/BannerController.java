package com.itie.mystore.api.v1.controller;

import com.itie.mystore.api.v1.entity.Banner;
import com.itie.mystore.api.v1.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/banner/")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("test")
    public List<Banner> test(){
        return bannerService.findAll();
    }

}
