package com.luckytree.shop_service.shop.adapter.out.persistence;


import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class GetShopPersistenceAdapter implements GetShopPort {

    private final ShopListRepository shopListRepository;

    @Override
    public List<ShopList> getShopListByCategory(String category) {
        List<ShopList> shopList =shopListRepository.findByCategory(category);
        return shopList;
    }
}
