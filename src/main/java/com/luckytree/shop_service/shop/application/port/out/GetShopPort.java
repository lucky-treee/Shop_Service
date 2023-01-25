package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.domain.ShopSummary;

import java.util.List;

public interface GetShopPort {

     List<ShopSummary> getShopSummaryByCategory(String category);

     List<ShopSummary> getShopAll();
}
