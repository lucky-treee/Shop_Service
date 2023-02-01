package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.application.port.out.GetShopPort;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class GetShopListPersistenceAdapter implements GetShopPort {

    private final ShopRepository shopRepository;
    private final ShopTempRepository shopTempRepository;

    @Override
    public List<ShopSummary> getShopSummaryByCategory(String category) {
        return shopRepository.findByCategoryAndStatus(category, ShopStatus.ENABLE).stream().map(ShopSummary::new).toList();
    }

    @Override
    public List<ShopSummary> getShopAll(double maxLat, double minLat, double maxLng, double minLng) {
        return shopRepository.findByStatusAndLatLessThanEqualAndLatGreaterThanEqualAndLngLessThanEqualAndLngGreaterThanEqual(ShopStatus.ENABLE, maxLat, minLat, maxLng, minLng).stream().map(ShopSummary::new).toList();
    }

    @Override
    public ShopDetail getShopDetail(String name, String address){
        Optional<ShopEntity> shopEntity = shopRepository.findByNameAndAddress(name, address);
        if(shopEntity.isPresent()){
            ShopDetail shopDetail = new ShopDetail(shopEntity.get());
            return shopDetail;
        }
        else{
            throw new NotFoundException("Shop not found");
        }
    }
}
