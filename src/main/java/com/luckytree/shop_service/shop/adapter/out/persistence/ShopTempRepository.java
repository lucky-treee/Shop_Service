package com.luckytree.shop_service.shop.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShopTempRepository extends JpaRepository<ShopTempEntity, Long> {

}
