package com.luckytree.shop_service.shop.application.port.in;


import com.luckytree.shop_service.shop.adapter.out.persistence.ShopEntity;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface GetShopListUseCase {

    List<ShopSummary> getShopSummaryByCategory(String category);

    List<ShopSummary> getShopAll(double maxLat, double minLat, double maxLng, double minLng);

    ShopDetail getShopDetail(Long shopId);
}