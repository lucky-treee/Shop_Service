package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopEntity;
import lombok.Getter;

@Getter
public class ShopSummary extends BaseTimeEntity {

    private Long id;
    private String name;
    private ShopStatus status;
    private Double lat;
    private Double lng;
    private String category;
    private Hashtag hashtag;

    public ShopSummary(ShopEntity shopEntity) {
        this.id = shopEntity.getId();
        this.name = shopEntity.getName();
        this.status = shopEntity.getStatus();
        this.lat = shopEntity.getLat();
        this.lng = shopEntity.getLng();
        this.category = shopEntity.getCategory();
        this.hashtag = shopEntity.getHashtag();
    }
}
