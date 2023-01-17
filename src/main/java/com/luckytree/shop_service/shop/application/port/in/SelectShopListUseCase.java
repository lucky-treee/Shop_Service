package com.luckytree.shop_service.shop.application.port.in;

import com.luckytree.shop_service.shop.domain.ShopList;

import java.util.List;

public interface SelectShopListUseCase {

    List<ShopList> requestShopListSelect(RequestShopListSelect requestShopListSelect);
}