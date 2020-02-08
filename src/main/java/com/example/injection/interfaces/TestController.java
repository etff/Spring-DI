package com.example.injection.interfaces;

import com.example.injection.applications.ItemService;
import com.example.injection.applications.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@RestController
public class TestController {

    private OrderService orderService;

    private ItemService itemService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    // TODO R1. 낮은 결합도 방식이지만 여전히 runtime에서 NullPointerException이 발생
    @GetMapping("/test")
    public void test() {
        orderService.setItem(itemService);
        orderService.change();
        orderService.hello();
    }
}
