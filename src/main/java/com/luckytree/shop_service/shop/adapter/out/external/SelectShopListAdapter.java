package com.luckytree.shop_service.shop.adapter.out.external;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListRepository;
import com.luckytree.shop_service.shop.application.port.out.SelectShopListPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class SelectShopListAdapter implements SelectShopListPort {

    private final ShopListRepository shopListRepository;

    @Override
    public List<ShopList> requestShopListSelect() {
        return shopListRepository.findAll().stream().map(ShopListEntity::toDomain).toList();
    }
}