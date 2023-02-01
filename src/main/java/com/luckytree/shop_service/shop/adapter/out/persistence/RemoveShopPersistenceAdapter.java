package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.RemoveShopPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class RemoveShopPersistenceAdapter implements RemoveShopPort {

    private final ShopRemoveRepository shopRemoveRepository;

    @Override
    public void saveRemoveRequest(Long shopId, String commmet) {
        shopRemoveRepository.save(new ShopRemoveEntity(shopId, commmet));
    }
}
