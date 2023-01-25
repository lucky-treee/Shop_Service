package com.luckytree.shop_service.shop.domain;

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

    public ShopDetail(ShopRequest shopRequest) {
        this.name = shopRequest.getShopName();
        this.category = shopRequest.getCategory();
        this.address = shopRequest.getAddress();
        this.photo = shopRequest.getPhoto();
        this.contact = shopRequest.getContact();
        this.homepage = shopRequest.getHomepage();
        this.flagshipProduct = shopRequest.getFlagshipProduct();
        this.operatingTime = shopRequest.getOperatingTime();
        this.sns = shopRequest.getSns();
    }
}
