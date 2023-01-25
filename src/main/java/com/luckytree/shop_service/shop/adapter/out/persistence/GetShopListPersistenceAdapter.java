package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
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
        return shopRepository.findByCategory(category).stream().map(ShopSummary::new).toList();
    }

    @Override
    public List<ShopSummary> getShopAll() {
        return shopRepository.findAll().stream().map(ShopSummary::new).toList();
    }
}
