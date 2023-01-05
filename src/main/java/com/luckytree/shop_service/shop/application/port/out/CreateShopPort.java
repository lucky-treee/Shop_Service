package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopDetailEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListEntity;

public interface CreateShopPort {

    Long saveShopDetail(ShopDetailEntity shopDetailEntity);
    void saveShopList(ShopListEntity shopListEntity);
}
