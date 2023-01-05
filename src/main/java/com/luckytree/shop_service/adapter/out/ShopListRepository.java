package com.luckytree.shop_service.adapter.out;

import com.luckytree.shop_service.domain.ShopList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopListRepository extends JpaRepository<ShopListEntity, Long> {
}
