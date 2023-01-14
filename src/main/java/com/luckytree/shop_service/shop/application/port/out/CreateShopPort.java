package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopDetailEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListEntity;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopList;

public interface CreateShopPort {

    Long saveShopDetail(ShopDetail shopDetail);
    void saveShopList(ShopList shopList);
}
