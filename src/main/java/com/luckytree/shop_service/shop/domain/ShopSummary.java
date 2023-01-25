package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopEntity;
import com.luckytree.shop_service.shop.application.port.in.RequestShopRegistration;
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

    @Builder
    public ShopSummary(Long id, String name, ShopStatus status, Double mapX, Double mapY, String category, Hashtag hashtag) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.mapX = mapX;
        this.mapY = mapY;
        this.category = category;
        this.hashtag = hashtag;
    }

    public ShopSummary(RequestShopRegistration requestShopRegistration, ShopStatus status) {
        this.name = requestShopRegistration.getShopName();
        this.status = status;
        this.mapX = requestShopRegistration.getMapX();
        this.mapY = requestShopRegistration.getMapY();
        this.category = requestShopRegistration.getCategory();
    }

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
