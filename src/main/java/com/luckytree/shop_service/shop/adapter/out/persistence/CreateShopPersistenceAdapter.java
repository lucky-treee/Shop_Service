package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.CreateShopPort;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CreateShopPersistenceAdapter implements CreateShopPort {

    private final ShopDetailRepository shopDetailRepository;
    private final ShopListRepository shopListRepository;

    @Override
    public Long saveShopDetail(ShopDetail shopDetail) {
        return shopDetailRepository.save(new ShopDetailEntity(shopDetail)).getId();
    }

    @Override
    public void saveShopList(ShopSummary shopSummary) {
        shopListRepository.save(new ShopListEntity(shopSummary));
    }
}
