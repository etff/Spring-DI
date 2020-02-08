package com.example.injection.applications;

import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
public class ItemService {

    // TODO 생성자 주입 방식으로 순환 참조를 방지
//    private final OrderService orderService;
//
//    public ItemService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void hello() {
        System.out.println("안녕");
    }
}
