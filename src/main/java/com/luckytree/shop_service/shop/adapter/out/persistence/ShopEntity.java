package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.Hashtag;
import com.luckytree.shop_service.shop.application.port.in.ShopRequest;
import com.luckytree.shop_service.shop.domain.ShopStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Table(name = "shop")
@Getter
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ShopEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50)
    private String category;

    @Column(length = 10, nullable = false)
    private ShopStatus status;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(name = "map_x", nullable = false)
    private Double mapX;

    @Column(name = "map_y", nullable = false)
    private Double mapY;

    @Column(length = 50)
    private Hashtag hashtag;

    @Column(length = 150)
    private String photo;

    @Column(length = 50)
    private String contact;

    @Column(length = 50)
    private String sns;

    @Column(length = 50)
    private String homepage;

    @Column(name = "flagship_product", length = 50)
    private String flagshipProduct;

    @Column(name = "operating_start")
    private LocalTime operatingStart;

    @Column(name = "operating_end")
    private LocalTime operatingEnd;

    @Column(length = 20)
    private String holiday;

    @OneToMany(mappedBy = "shopEntity")
    private List<ShopTempEntity> shopTempEntityList;

    public ShopEntity(ShopRequest shopRequest) {
        this.name = shopRequest.getShopName();
        this.category = shopRequest.getCategory();
        this.status = ShopStatus.DISABLE;
        this.address = shopRequest.getAddress();
        this.mapX = shopRequest.getMapX();
        this.mapY = shopRequest.getMapY();
        this.photo = shopRequest.getPhoto();
        this.contact = shopRequest.getContact();
        this.sns = shopRequest.getSns();
        this.homepage = shopRequest.getHomepage();
        this.flagshipProduct = shopRequest.getFlagshipProduct();
        this.operatingStart = shopRequest.getOperatingStart();
        this.operatingEnd = shopRequest.getOperatingEnd();
        this.holiday = shopRequest.getHoliday();
    }
}
