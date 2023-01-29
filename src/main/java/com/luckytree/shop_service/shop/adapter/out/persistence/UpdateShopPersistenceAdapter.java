package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.in.ShopRequest;
import com.luckytree.shop_service.shop.application.port.out.UpdateShopPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class UpdateShopPersistenceAdapter implements UpdateShopPort {

    private final ShopTempRepository shopTempRepository;

    private final ShopRepository shopRepository;

    @Override
    public void registerShopUpdate(ShopRequest shopRequest, Long shopId) {
        shopTempRepository.save(new ShopTempEntity(shopRequest, shopId));
    }

    @Override
    public Long findShopId(String name, String address) {
        Optional<ShopEntity> optionalShopEntity = shopRepository.findByNameAndAddress(name, address);
        if (optionalShopEntity.isPresent()) {
            return optionalShopEntity.get().getId();
        }
        throw new NotFoundException("일치하는 shopId가 없습니다.");
    }
}