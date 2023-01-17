package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.application.port.in.RequestShopListSelect;
import com.luckytree.shop_service.shop.application.port.in.SelectShopListUseCase;
import com.luckytree.shop_service.shop.application.port.out.SelectShopListPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SelectShopListService implements SelectShopListUseCase {

    private final SelectShopListPort selectShopListPort;

    @Transactional(readOnly = true)
    @Override
    public List<ShopList> requestShopListSelect(RequestShopListSelect requestShopListSelect) {
        List<ShopList> shopList = selectShopListPort.requestShopListSelect(requestShopListSelect);
        return shopList;
    }
}