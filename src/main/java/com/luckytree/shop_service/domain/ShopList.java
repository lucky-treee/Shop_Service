package com.luckytree.shop_service.domain;

import jakarta.persistence.*;

@Table(name = "shop_list")
@Entity
public class ShopList extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false)
    private String shopDetailId;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String status;

    private double mapX;

    private double mapY;

    @Column(length = 50)
    private String category;

    @Column(length = 50)
    private String hashtag;

}
