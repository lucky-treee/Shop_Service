package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.ShopSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopListRepository extends JpaRepository<ShopListEntity, Long> {

    List<ShopEntity> findByCategory(String category);

    List<ShopEntity> findAll();
}
