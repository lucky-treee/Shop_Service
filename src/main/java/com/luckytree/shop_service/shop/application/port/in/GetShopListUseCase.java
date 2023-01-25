package com.luckytree.shop_service.shop.application.port.in;


import com.luckytree.shop_service.shop.domain.ShopSummary;

import java.util.List;

public interface GetShopListUseCase {

    List<ShopSummary> getShopSummaryByCategory(String category);

    List<ShopSummary> getShopAll();
}
