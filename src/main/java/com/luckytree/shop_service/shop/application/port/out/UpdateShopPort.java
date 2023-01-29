package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.application.port.in.ShopRequest;

public interface UpdateShopPort {

    void registerShopUpdate(ShopRequest shopRequest, Long shopId);

    Long findShopId(String name, String address);
}