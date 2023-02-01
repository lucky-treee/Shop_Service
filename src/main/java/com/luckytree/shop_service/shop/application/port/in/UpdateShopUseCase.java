package com.luckytree.shop_service.shop.application.port.in;

public interface UpdateShopUseCase {

    void registerShopUpdate(ShopRequest shopRequest,String name,String address);
}