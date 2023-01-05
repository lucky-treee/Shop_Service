package com.luckytree.shop_service.adapter.out;

import com.luckytree.shop_service.domain.Hashtag;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Table(name = "shop_detail")
@Getter
@Builder
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

}
