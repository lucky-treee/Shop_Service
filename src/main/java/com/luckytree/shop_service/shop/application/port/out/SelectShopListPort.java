package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.application.port.in.RequestShopListSelect;
import com.luckytree.shop_service.shop.domain.ShopList;

import java.util.List;

public interface SelectShopListPort {
    List<ShopList> requestShopListSelect(RequestShopListSelect requestShopListSelect);
}