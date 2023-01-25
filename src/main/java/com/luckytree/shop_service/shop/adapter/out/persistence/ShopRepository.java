package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.ShopStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<ShopEntity, Long> {

    List<ShopEntity> findByCategoryAndStatus(String category, ShopStatus shopStatus);

    List<ShopEntity> findByStatus(ShopStatus shopStatus);
}
