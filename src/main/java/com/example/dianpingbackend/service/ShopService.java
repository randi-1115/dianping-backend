package com.example.dianpingbackend.service;

import com.example.dianpingbackend.entity.Shop;
import java.util.List;

public interface ShopService {
    List<Shop> getAllShops();
    Shop getShopById(Long id);
    int addShop(Shop shop);
    int updateShop(Shop shop);
    int deleteShop(Long id);
    List<Shop> getShopsByCategory(String category);
    List<Shop> searchShops(String keyword);
}
