package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.ShopDetailEntity;
import com.luckytree.shop_service.shop.application.port.in.RequestShopRegistration;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class ShopDetail {

    private Long id;
    private String name;
    private String category;
    private String address;
    private String photo;
    private String contact;
    private String homepage;
    private String flagshipProduct;
    private Hashtag hashtag;
    private String operatingTime;
    private String sns;

    public ShopDetail(long id, String name, String category, String address, String photo, String contact, String homepage, String flagshipProduct, Hashtag hashtag, String operatingTime, String sns) {
        this.id = id;
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

    public ShopDetail(RequestShopRegistration requestShopRegistration) {
        this.name = requestShopRegistration.getShopName();
        this.category = requestShopRegistration.getCategory();
        this.address = requestShopRegistration.getAddress();
        this.photo = requestShopRegistration.getPhoto();
        this.contact = requestShopRegistration.getContact();
        this.homepage = requestShopRegistration.getHomepage();
        this.flagshipProduct = requestShopRegistration.getFlagshipProduct();
        this.operatingTime = requestShopRegistration.getOperatingTime();
        this.sns = requestShopRegistration.getSns();
    }

    public ShopDetailEntity toEntity() {
        return ShopDetailEntity.builder()
                .address(this.address)
                .category(this.category)
                .contact(this.contact)
                .flagshipProduct(this.flagshipProduct)
                .hashtag(this.hashtag)
                .homepage(this.homepage)
                .name(this.name)
                .operatingTime(this.operatingTime)
                .sns(this.sns)
                .photo(this.photo)
                .build();
    }
}
