package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ShopSummary extends BaseTimeEntity {

    private Long id;
    private String name;
    private ShopStatus status;
    private Double mapX;
    private Double mapY;
    private String category;
    private Hashtag hashtag;

    public ShopSummary(ShopEntity shopEntity) {
        this.id = shopEntity.getId();
        this.name = shopEntity.getName();
        this.status = shopEntity.getStatus();
        this.mapX = shopEntity.getMapX();
        this.mapY = shopEntity.getMapY();
        this.category = shopEntity.getCategory();
        this.hashtag = shopEntity.getHashtag();
    }
}
