package com.luckytree.shop_service.shop.application.port.in;


import com.luckytree.shop_service.shop.domain.ShopSummary;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface GetShopListUseCase {

    List<ShopSummary> getShopSummaryByCategory(String category);

    List<ShopSummary> getShopAll(double maxLat, double minLat, double maxLng, double minLng);
}
