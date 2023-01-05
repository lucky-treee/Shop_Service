package com.luckytree.shop_service.application.service;

import com.luckytree.shop_service.application.port.in.CreateShopUseCase;
import com.luckytree.shop_service.application.port.in.RequestShopRegistration;
import com.luckytree.shop_service.application.port.out.CreateShopPort;
import com.luckytree.shop_service.domain.ShopDetail;
import com.luckytree.shop_service.domain.ShopList;
import com.luckytree.shop_service.domain.ShopStatus;
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
        Long shopDetailId = createShopPort.saveShopDetail(shopDetail.toEntity());

        ShopList shopList = new ShopList(requestShopRegistration, shopDetailId, ShopStatus.DISABLE);
        createShopPort.saveShopList(shopList.toEntity());
    }

}

