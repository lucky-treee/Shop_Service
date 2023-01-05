package com.luckytree.shop_service.application.port.out;

import com.luckytree.shop_service.adapter.out.ShopDetailEntity;
import com.luckytree.shop_service.adapter.out.ShopListEntity;
import lombok.RequiredArgsConstructor;

public interface CreateShopPort {

    Long saveShopDetail(ShopDetailEntity shopDetailEntity);
    void saveShopList(ShopListEntity shopListEntity);
}
