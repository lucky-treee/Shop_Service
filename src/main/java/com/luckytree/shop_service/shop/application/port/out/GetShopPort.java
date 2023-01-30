package com.luckytree.shop_service.shop.application.port.out;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopTempEntity;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopSummary;

import java.util.List;

public interface GetShopPort {

     List<ShopSummary> getShopSummaryByCategory(String category);

     List<ShopSummary> getShopAll(double maxLat, double minLat, double maxLng, double minLng);
     ShopTempEntity getShopTempEntityById(Long shopId);
}
