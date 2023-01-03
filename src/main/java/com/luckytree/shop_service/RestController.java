package com.luckytree.shop_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 통신 테스트를 위한 임시 컨트롤러 - 삭제 예정
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/shop")
public class RestController {

    @GetMapping("/shop-test")
    String call(String name) {
        return "yeah!";
    }
}
