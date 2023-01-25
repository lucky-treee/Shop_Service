package com.luckytree.shop_service.shop.application.port.in;

import com.luckytree.shop_service.shop.domain.ShopRequest;

public interface CreateShopUseCase {
    void requestShopRegistration(ShopRequest shopRequest);
}
