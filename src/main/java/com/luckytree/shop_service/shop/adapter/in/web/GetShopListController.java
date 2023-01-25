package com.luckytree.shop_service.shop.adapter.in.web;

import com.luckytree.shop_service.common.dto.ResultResponse;
import com.luckytree.shop_service.shop.application.port.in.GetShopListUseCase;
import com.luckytree.shop_service.shop.domain.ShopSummary;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "샵 조회", description = "샵 조회 API 모음")
@RestController
@RequestMapping("/shop/get")
@RequiredArgsConstructor
public class GetShopListController {

    private final GetShopListUseCase getShopListUseCase;

    @Operation(summary = "특정 카테고리의 샵 전체 검색")
    @GetMapping("/{category}")
    public ResultResponse getShopListByCategory(@PathVariable("category") String category) {
        List<ShopSummary> shopSummaryList = getShopListUseCase.getShopSummaryByCategory(category);
        return new ResultResponse<>(shopSummaryList);
    }

    @Operation(summary = "모든 샵 검색")
    @GetMapping("/all")
    public ResultResponse getShopAll() {
        List<ShopSummary> shopSummary = getShopListUseCase.getShopAll();
        return new ResultResponse<>(shopSummary);
    }
}