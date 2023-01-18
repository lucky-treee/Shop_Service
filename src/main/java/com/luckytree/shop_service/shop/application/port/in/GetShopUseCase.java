package com.luckytree.shop_service.shop.application.port.in;

import com.luckytree.shop_service.shop.domain.ShopList;

import java.util.List;

public interface GetShopUseCase {
    //ShopList getShopListByCategory(String category); // 단건 조회
    List<ShopList> getShopListByCategory(String category);
}
