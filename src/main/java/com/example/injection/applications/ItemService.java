package com.example.injection.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
public class ItemService {

    @Autowired
    private OrderService orderService;

    // TODO R1 @Component가 mutable 하기 때문에 NullPointerException으로 부터 안전하지 않음
    public void mutable() {
        orderService.hello();
        orderService = null;
        //orderService.hello();
    }

    // TODO R2 Runtime에서 순환참조 문제로 예기치 않은 StackOverFlowError가 발생
    public void circular() {
        orderService.circular();
    }
}
