package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
import com.luckytree.shop_service.shop.domain.Hashtag;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class GetShopListPersistenceAdapter implements GetShopPort {

    private final ShopRepository shopRepository;

    @Override
    public List<ShopSummary> getShopSummaryByCategory(String category) {
        return shopRepository.findByCategoryAndStatus(category, ShopStatus.ENABLE).stream().map(ShopSummary::new).toList();
    }

    @Override
    public List<ShopSummary> getShopAll(double maxLat, double minLat, double maxLng, double minLng) {
        return shopRepository.findByStatusAndLatLessThanEqualAndLatGreaterThanEqualAndLngLessThanEqualAndLngGreaterThanEqual(ShopStatus.ENABLE, maxLat, minLat, maxLng, minLng).stream().map(ShopSummary::new).toList();
    }

    @Override
    public List<ShopSummary> getShopSummaryByHashtag(Hashtag hashtag) {
        return shopRepository.findByHashtagAndStatus(hashtag, ShopStatus.ENABLE).stream().map(ShopSummary::new).toList();
    }
}
