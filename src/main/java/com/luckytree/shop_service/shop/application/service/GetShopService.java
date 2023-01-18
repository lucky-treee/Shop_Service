package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.application.port.in.GetShopUseCase;
import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetShopService implements GetShopUseCase {  // 유스케이스에 있는 내용을 상속받아서 서비스에서 구현.

    private final GetShopPort getShopPort;

    @Override
    public List<ShopList> getShopListByCategory(String category) {
        List<ShopList> shopList = getShopPort.getShopListByCategory(category);
        return shopList;

    }
}
