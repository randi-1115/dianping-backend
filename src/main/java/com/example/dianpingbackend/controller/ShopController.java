package com.example.dianpingbackend.controller;

import com.example.dianpingbackend.entity.Shop;
import com.example.dianpingbackend.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/shops") // 统一前缀
@CrossOrigin
public class ShopController {

    @Autowired
    private ShopService shopService;

    // 1. 查询所有店铺
    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    // 2. 按ID查询单个店铺
    @GetMapping("/{id}")
    public Shop getShopById(@PathVariable Long id) {
        return shopService.getShopById(id);
    }

    // 3. 新增店铺（JSON参数）
    @PostMapping
    public int addShop(@RequestBody Shop shop) {
        return shopService.addShop(shop);
    }

    // 4. 更新店铺（JSON参数）
    @PutMapping("/{id}")
    public int updateShop(@PathVariable Long id, @RequestBody Shop shop) {
        shop.setId(id); // 确保ID一致
        return shopService.updateShop(shop);
    }

    // 5. 按ID删除店铺
    @DeleteMapping("/{id}")
    public int deleteShop(@PathVariable Long id) {
        return shopService.deleteShop(id);
    }

    // 6. 按品类查询（例如：/api/shops/category?category=餐饮）
    @GetMapping("/category")
    public List<Shop> getByCategory(@RequestParam String category) {
        return shopService.getShopsByCategory(category);
    }

    // 7. 模糊搜索（例如：/api/shops/search?keyword=北京）
    @GetMapping("/search")
    public List<Shop> search(@RequestParam String keyword) {
        return shopService.searchShops(keyword);
    }
}