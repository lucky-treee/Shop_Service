package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.ShopList;

import java.util.List;

public interface ShopListRepositoryCustom {

    List<ShopList> findAllByCoordinate(Double mapX, Double mapY);
}