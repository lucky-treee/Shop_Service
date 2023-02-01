package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopEntity;
import com.luckytree.shop_service.shop.application.port.in.RemoveRequestForm;
import com.luckytree.shop_service.shop.application.port.in.RemoveShopUseCase;
import com.luckytree.shop_service.shop.application.port.out.RemoveShopPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RemoveShopService implements RemoveShopUseCase {

    private final RemoveShopPort removeShopPort;

    @Transactional
    @Override
    public void removeShopRequest(RemoveRequestForm removeRequestForm) {
        ShopEntity shopEntity = removeShopPort.findByNameAndAddress(removeRequestForm.getName(), removeRequestForm.getAddress());
        removeShopPort.saveRemoveRequest(shopEntity.getId(), removeRequestForm.getComment());
    }
}
