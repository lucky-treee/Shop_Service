package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.application.port.in.ShopRequest;
import com.luckytree.shop_service.shop.application.port.in.UpdateShopUseCase;
import com.luckytree.shop_service.shop.application.port.out.UpdateShopPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateShopService implements UpdateShopUseCase {

    private final UpdateShopPort updateShopPort;

    @Transactional
    @Override
    public void registerShopUpdate(ShopRequest shopRequest, String name, String address) {
        Long shopId = findShopId(name, address);
        updateShopPort.registerShopUpdate(shopRequest, shopId);
    }

    private Long findShopId(String name, String address) {
        Long shopId = updateShopPort.findShopId(name, address);
        return shopId;
    }
}