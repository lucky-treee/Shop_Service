package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.CreateShopPort;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopRequest;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CreateShopPersistenceAdapter implements CreateShopPort {

    private final ShopRepository shopRepository;

    @Override
    public void saveShopWithDisable(ShopRequest shopRequest) {
        shopRepository.save(new ShopEntity(shopRequest));
    }
}
