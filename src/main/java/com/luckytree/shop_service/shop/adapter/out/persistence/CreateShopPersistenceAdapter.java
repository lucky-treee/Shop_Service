package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.CreateShopPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CreateShopPersistenceAdapter implements CreateShopPort {

    private final ShopDetailRepository shopDetailRepository;
    private final ShopListRepository shopListRepository;

    @Override
    public Long saveShopDetail(ShopDetailEntity shopDetailEntity) {
        return shopDetailRepository.save(shopDetailEntity).getId();
    }

    @Override
    public void saveShopList(ShopListEntity shopListEntity) {
        shopListRepository.save(shopListEntity);
    }
}
