package com.example.dianpingbackend.mapper;

import com.example.dianpingbackend.entity.Shop;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper // 标记为MyBatis映射接口
public interface ShopMapper {
    // 查询所有店铺
    List<Shop> selectAll();

}
