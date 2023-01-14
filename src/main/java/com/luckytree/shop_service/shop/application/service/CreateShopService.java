package com.luckytree.shop_service.shop.application.service;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopDetailEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListEntity;
import com.luckytree.shop_service.shop.application.port.in.CreateShopUseCase;
import com.luckytree.shop_service.shop.application.port.in.RequestShopRegistration;
import com.luckytree.shop_service.shop.application.port.out.CreateShopPort;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopList;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateShopService implements CreateShopUseCase {

    private final CreateShopPort createShopPort;

    @Transactional
    @Override
    public void requestShopRegistration(RequestShopRegistration requestShopRegistration) {
        ShopDetail shopDetail = new ShopDetail(requestShopRegistration);
        Long shopDetailId = createShopPort.saveShopDetail(shopDetail);

        ShopList shopList = new ShopList(requestShopRegistration, shopDetailId, ShopStatus.DISABLE);
        createShopPort.saveShopList(shopList);
    }

}

