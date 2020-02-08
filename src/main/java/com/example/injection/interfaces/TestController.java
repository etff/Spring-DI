package com.example.injection.interfaces;

import com.example.injection.applications.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@RestController
@RequiredArgsConstructor
public class TestController {

    private final OrderService orderService;

    @Value("${item.category}")
    private String itemCategory;

    @GetMapping("/hello")
    public void test() {
        orderService.hello();
        System.out.println(itemCategory);
    }
}
