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
    @Override
    public Shop getShopById(Long id){
        return shopMapper.selectById(id);
    }
    @Override
    public int addShop(Shop shop) {
        return shopMapper.insert(shop);
    }

    @Override
    public int updateShop(Shop shop) {
        return shopMapper.update(shop);
    }

    @Override
    public int deleteShop(Long id) {
        return shopMapper.deleteById(id);
    }

    @Override
    public List<Shop> getShopsByCategory(String category) {
        return shopMapper.selectByCategory(category);
    }

    @Override
    public List<Shop> searchShops(String keyword) {
        return shopMapper.selectByKeyword(keyword);
    }

}
