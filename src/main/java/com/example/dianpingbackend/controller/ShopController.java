package com.example.dianpingbackend.controller;

import com.example.dianpingbackend.entity.Shop;
import com.example.dianpingbackend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api") // 接口统一前缀
@CrossOrigin // 允许跨域请求（前端调用时需要）
public class ShopController {

    @Autowired
    private ShopService shopService;

    // 提供查询所有店铺的接口：/api/shops
    @GetMapping("/shops")
    public List<Shop> getShops() {
        return shopService.getAllShops();
    }
}
