package com.luckytree.shop_service.domain;

import jakarta.persistence.*;

@Table(name = "shop_detail")
@Entity
public class ShopDetail extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
    private String hashtag;

    @Column(length = 50, nullable = false)
    private String operatingTime;

    @Column(length = 50)
    private String sns;

}
