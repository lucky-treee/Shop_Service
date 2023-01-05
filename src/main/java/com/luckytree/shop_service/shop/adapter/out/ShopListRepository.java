package com.luckytree.shop_service.shop.adapter.out;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopListRepository extends JpaRepository<ShopListEntity, Long> {
}
