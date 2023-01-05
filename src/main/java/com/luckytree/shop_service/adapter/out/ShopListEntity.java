package com.luckytree.shop_service.adapter.out;

import com.luckytree.shop_service.domain.Hashtag;
import com.luckytree.shop_service.domain.ShopStatus;
import jakarta.persistence.*;
import lombok.Builder;

@Table(name = "shop_list")
@Builder
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

    private Double mapX;

    private Double mapY;

    @Column(length = 50)
    private String category;

    @Column(length = 50)
    private Hashtag hashtag;
}
