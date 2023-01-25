package com.luckytree.shop_service.shop.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<ShopEntity, Long> {

    List<ShopEntity> findByCategory(String category);
}
