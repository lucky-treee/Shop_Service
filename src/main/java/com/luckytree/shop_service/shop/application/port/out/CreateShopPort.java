package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.adapter.out.ShopDetailEntity;
import com.luckytree.shop_service.shop.adapter.out.ShopListEntity;

public interface CreateShopPort {

    Long saveShopDetail(ShopDetailEntity shopDetailEntity);
    void saveShopList(ShopListEntity shopListEntity);
}
