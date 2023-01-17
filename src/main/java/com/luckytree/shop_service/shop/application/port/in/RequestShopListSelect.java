package com.luckytree.shop_service.shop.application.port.in;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestShopListSelect {

    @NotNull
    private double mapX;

    @NotNull
    private double mapY;
}
