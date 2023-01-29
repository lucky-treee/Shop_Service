package com.luckytree.shop_service.shop.adapter.in.web;

import com.luckytree.shop_service.common.dto.ResultResponse;
import com.luckytree.shop_service.shop.application.port.in.ShopRequest;
import com.luckytree.shop_service.shop.application.port.in.UpdateShopUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Tag(name = "샵 수정", description = "샵 수정 관련 API 입니다")
@RestController
@RequestMapping("/shop/update")
@RequiredArgsConstructor
public class UpdateShopController {

    private final UpdateShopUseCase updateShopUseCase;

    @Operation(summary = "샵 수정 요청 API")
    @PostMapping("/{name}/{address}")
    public ResultResponse requestShopUpdate(@RequestBody @Valid ShopRequest shopRequest,@PathVariable("name") String name,@PathVariable("address") String address) {
        updateShopUseCase.registerShopUpdate(shopRequest,name,address);
        return new ResultResponse<>(HttpStatus.OK);
    }
}
