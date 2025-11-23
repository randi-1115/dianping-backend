package com.example.dianpingbackend.service.impl;
import com.example.dianpingbackend.entity.Shop;
import com.example.dianpingbackend.mapper.ShopMapper;
import com.example.dianpingbackend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Override
    public List<Shop> getAllShops() {
        return shopMapper.selectAll();
    }
}
