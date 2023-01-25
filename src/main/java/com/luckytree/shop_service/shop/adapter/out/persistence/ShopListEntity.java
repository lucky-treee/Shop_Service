package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.Hashtag;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Table(name = "shop_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ShopListEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private Long shopDetailId;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private ShopStatus status;

    @Column(name = "map_x")
    private Double mapX;

    @Column(name = "map_y")
    private Double mapY;

    @Column(length = 50)
    private String category;

    @Column(length = 50)
    private Hashtag hashtag;

    @Builder
    public ShopListEntity(Long shopDetailId, String name, ShopStatus status, Double mapX, Double mapY, String category, Hashtag hashtag) {
        this.shopDetailId = shopDetailId;
        this.name = name;
        this.status = status;
        this.mapX = mapX;
        this.mapY = mapY;
        this.category = category;
        this.hashtag = hashtag;
    }

    public ShopListEntity(ShopSummary shopSummary) {
        this.shopDetailId = shopSummary.getShopDetailId();
        this.name = shopSummary.getName();
        this.status = shopSummary.getStatus();
        this.mapX = shopSummary.getMapX();
        this.mapY = shopSummary.getMapY();
        this.category = shopSummary.getCategory();
        this.hashtag = shopSummary.getHashtag();
    }

    public ShopSummary toDomain() {
        return ShopSummary.builder()
                .id(id)
                .shopDetailId(shopDetailId)
                .name(name)
                .status(status)
                .mapX(mapX)
                .mapY(mapY)
                .category(category)
                .hashtag(hashtag)
                .build();
    }
}
