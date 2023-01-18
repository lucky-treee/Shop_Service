package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.ShopList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopListRepository extends JpaRepository<ShopListEntity, Long> {

    List<ShopList> findByCategory(String category);
}
