package com.luckytree.shop_service.shop.domain;

import com.luckytree.shop_service.shop.adapter.out.persistence.BaseTimeEntity;
import lombok.Getter;

@Getter
public class ShopDetail extends BaseTimeEntity {

    Long ShopId;
    String shopName;
    String category;
    String hashTag;
    String shopAddress;
    String photo;
    String contact;
    String homepage;
    String flagshipProduct;
    String operatingTime;
    String sns;
    Double lat;
    Double lng;
    String operatingStart;
    String operationEnd;
    String holiday;
}
