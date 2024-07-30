package com.itie.mystore.api.v1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("mystore_banner")
@Data
public class Banner {
    private Long id;
    private String name;
    private String title;
    private String image;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Date deleteTime;
}
