package com.luckytree.shop_service.shop.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class ShopRequest {

    @NotBlank
    @Size(max = 50)
    private String shopName;

    @Size(max = 50)
    private String category;

    @NotBlank
    @Size(max = 50)
    private String address;

    @Size(max = 150)
    private String photo;

    @Size(max = 50)
    private String contact;

    @Size(max = 50)
    private String homepage;

    @Size(max = 50)
    private String flagshipProduct;

    @NotBlank
    @Size(max = 50)
    private String operatingTime;

    @Size(max = 50)
    private String sns;

    @NotNull
    private double mapX;

    @NotNull
    private double mapY;

    private LocalTime operatingStart;

    private LocalTime operatingEnd;

    @Size(max = 20)
    private String holiday;
}
