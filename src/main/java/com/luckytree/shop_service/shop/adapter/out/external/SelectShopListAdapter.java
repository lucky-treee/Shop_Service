package com.luckytree.shop_service.shop.adapter.out.external;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListRepository;
import com.luckytree.shop_service.shop.application.port.in.RequestShopListSelect;
import com.luckytree.shop_service.shop.application.port.out.SelectShopListPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SelectShopListAdapter implements SelectShopListPort {

    private final ShopListRepository shopListRepository;

    @Override
    public List<ShopList> requestShopListSelect(RequestShopListSelect requestShopListSelect) {
        Double mapX = requestShopListSelect.getMapX();
        Double mapY = requestShopListSelect.getMapY();
        List<ShopList> shopList = shopListRepository.findAllByCoordinate(mapX, mapY);
        return shopList;
    }
}
