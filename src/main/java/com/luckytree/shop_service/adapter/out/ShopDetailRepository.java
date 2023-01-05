package com.luckytree.shop_service.adapter.out;

import com.luckytree.shop_service.domain.ShopDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDetailRepository extends JpaRepository<ShopDetailEntity, Long> {
}
