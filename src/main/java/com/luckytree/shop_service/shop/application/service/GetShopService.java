package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.application.port.in.GetShopUseCase;
import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
import com.luckytree.shop_service.shop.domain.ShopList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetShopService implements GetShopUseCase {

    private final GetShopPort getShopPort;

    @Transactional(readOnly = true)
    @Override
    public List<ShopList> getShopListByCategory(String category) {
        return getShopPort.getShopListByCategory(category);
    }
}
