package com.example.dianpingbackend.mapper;

import com.example.dianpingbackend.entity.Shop;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper // 标记为MyBatis映射接口
public interface ShopMapper {
    // 查询所有店铺
    List<Shop> selectAll();
    Shop selectById(Long id);
    int insert(Shop shop);
    int update(Shop shop);
    int deleteById(Long id);
    List<Shop> selectByCategory(String category);
    List<Shop> selectByKeyword(String keyword);

}
