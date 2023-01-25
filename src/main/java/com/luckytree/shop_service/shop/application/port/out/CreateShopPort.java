package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopSummary;

public interface CreateShopPort {

    Long saveShopDetail(ShopDetail shopDetail);
    void saveShopList(ShopSummary shopSummary);
}
