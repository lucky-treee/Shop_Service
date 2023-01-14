package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopListEntity;
import com.luckytree.shop_service.shop.application.port.in.RequestShopRegistration;
import lombok.Getter;

@Getter
public class ShopList extends BaseTimeEntity {

    private Long id;
    private Long shopDetailId;
    private String name;
    private ShopStatus status;
    private Double mapX;
    private Double mapY;
    private String category;
    private Hashtag hashtag;

    public ShopList(Long id, Long shopDetailId, String name, ShopStatus status, Double mapX, Double mapY, String category, Hashtag hashtag) {
        this.id = id;
        this.shopDetailId = shopDetailId;
        this.name = name;
        this.status = status;
        this.mapX = mapX;
        this.mapY = mapY;
        this.category = category;
        this.hashtag = hashtag;
    }

    public ShopList(RequestShopRegistration requestShopRegistration, Long shopDetailId, ShopStatus status) {
        this.shopDetailId = shopDetailId;
        this.name = requestShopRegistration.getShopName();
        this.status = status;
        this.mapX = requestShopRegistration.getMapX();
        this.mapY = requestShopRegistration.getMapY();
        this.category = requestShopRegistration.getCategory();
    }
}
