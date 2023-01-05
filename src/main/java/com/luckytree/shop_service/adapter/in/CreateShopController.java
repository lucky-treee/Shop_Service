package com.luckytree.shop_service.adapter.in;

import com.luckytree.shop_service.application.port.in.CreateShopUseCase;
import com.luckytree.shop_service.application.port.in.RequestShopRegistration;
import com.luckytree.shop_service.common.dto.ResultResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop/create")
@RequiredArgsConstructor
public class CreateShopController {

    private final CreateShopUseCase createShopUseCase;

    @PostMapping("/request")
    public ResultResponse requestShopRegistration(@Valid RequestShopRegistration requestShopRegistration) {
        createShopUseCase.requestShopRegistration(requestShopRegistration);
        return new ResultResponse<>(HttpStatus.OK);
    }
}
