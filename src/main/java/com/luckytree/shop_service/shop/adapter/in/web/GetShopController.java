package com.luckytree.shop_service.shop.adapter.in.web;

import com.luckytree.shop_service.common.dto.ResultResponse;
import com.luckytree.shop_service.shop.application.port.in.GetShopUseCase;
import com.luckytree.shop_service.shop.domain.ShopList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "샵 조회", description = "샵 조회 관련 API 입니다.")
@RestController
@RequestMapping("/shop/get")
@RequiredArgsConstructor
public class GetShopController {

    private final GetShopUseCase getShopUseCase;

    @Operation(summary = "카테고리를 통해서 샵 목록 조회  API")
    @GetMapping("/{category}")
    public ResultResponse getShopListByCategory(@PathVariable("category") String category) {
        List<ShopList> shopList = getShopUseCase.getShopListByCategory(category);
        return new ResultResponse<>(shopList);
    }
}
