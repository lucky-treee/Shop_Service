package com.luckytree.shop_service.application.port.in;

import com.luckytree.shop_service.common.dto.ResultResponse;

public interface CreateShopUseCase {
    void requestShopRegistration(RequestShopRegistration requestShopRegistration);
}
