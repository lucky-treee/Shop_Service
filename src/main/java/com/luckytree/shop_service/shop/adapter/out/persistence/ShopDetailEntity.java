package com.luckytree.shop_service.shop.adapter.out.persistence;

import com.luckytree.shop_service.shop.domain.Hashtag;
import com.luckytree.shop_service.shop.domain.ShopDetail;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "shop_detail")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class ShopDetailEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 50)
    private String category;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 150)
    private String photo;

    @Column(length = 50)
    private String contact;

    @Column(length = 50)
    private String homepage;

    @Column(length = 50)
    private String flagshipProduct;

    @Column(length = 50)
    private Hashtag hashtag;

    @Column(length = 50, nullable = false)
    private String operatingTime;

    @Column(length = 50)
    private String sns;

    @Builder
    public ShopDetailEntity(String name, String category, String address, String photo, String contact, String homepage, String flagshipProduct, Hashtag hashtag, String operatingTime, String sns) {
        this.name = name;
        this.category = category;
        this.address = address;
        this.photo = photo;
        this.contact = contact;
        this.homepage = homepage;
        this.flagshipProduct = flagshipProduct;
        this.hashtag = hashtag;
        this.operatingTime = operatingTime;
        this.sns = sns;
    }

    public ShopDetailEntity(ShopDetail shopDetail) {
        this.name = shopDetail.getName();
        this.category = shopDetail.getCategory();
        this.address = shopDetail.getAddress();
        this.photo = shopDetail.getPhoto();
        this.contact = shopDetail.getContact();
        this.homepage = shopDetail.getHomepage();
        this.flagshipProduct = shopDetail.getFlagshipProduct();
        this.hashtag = shopDetail.getHashtag();
        this.operatingTime = shopDetail.getOperatingTime();
        this.sns = shopDetail.getSns();
    }
}
