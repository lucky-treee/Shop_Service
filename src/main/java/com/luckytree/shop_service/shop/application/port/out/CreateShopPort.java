package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopRequest;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import com.luckytree.shop_service.shop.domain.ShopSummary;

public interface CreateShopPort {

    void saveShopWithDisable(ShopRequest shopRequest);
}
