package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import com.luckytree.shop_service.shop.adapter.out.persistence.ShopTempEntity;
import lombok.Getter;

@Getter
public class ShopDetail extends BaseTimeEntity {

    private Long id;
    private String shopName;
    private String category;
    private Hashtag hashTag;
    private ShopStatus status;
    private String shopAddress;
    private String photo;
    private String contact;
    private String homepage;
    private String flagshipProduct;
    private  String sns;
    private  Double lat;
    private  Double lng;
    private String operatingStart;
    private  String operationEnd;
    private String holiday;

    public ShopDetail(ShopTempEntity shopTempEntity){
        this.id = shopTempEntity.getId();
        this.shopName = shopTempEntity.getName();
        this.category = shopTempEntity.getCategory();
        this.hashTag = shopTempEntity.getHashtag();
        this.shopAddress = shopTempEntity.getAddress();
        this.photo = shopTempEntity.getPhoto();
        this.contact = shopTempEntity.getContact();
        this.homepage = shopTempEntity.getHomepage();
        this.flagshipProduct = shopTempEntity.getFlagshipProduct();
        this.sns = shopTempEntity.getSns();
        this.lat = shopTempEntity.getLat();
        this.lng = shopTempEntity.getLng();
        this.operatingStart = shopTempEntity.getOperatingStart().toString();
        this.operationEnd = shopTempEntity.getOperatingEnd().toString();
        this.holiday = shopTempEntity.getHoliday();
    }
}
