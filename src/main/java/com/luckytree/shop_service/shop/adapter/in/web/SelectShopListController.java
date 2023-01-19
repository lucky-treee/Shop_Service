package com.luckytree.shop_service.shop.adapter.in.web;

import com.luckytree.shop_service.common.dto.ResultResponse;
import com.luckytree.shop_service.shop.application.port.in.SelectShopListUseCase;
import com.luckytree.shop_service.shop.domain.ShopList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "샵 리스트 조회", description = "샵 리스트 조회 관련 API 입니다.")
@RestController
@RequestMapping("/shop/selectShopList")
@RequiredArgsConstructor
public class SelectShopListController {

    private final SelectShopListUseCase selectShopListUseCase;

    @Operation(summary = "샵 리스트 검색 API")
    @GetMapping
    public ResultResponse requestShopRegistration() {
        List<ShopList> shopList = selectShopListUseCase.requestShopListSelect();
        return new ResultResponse<>(shopList);
    }
}