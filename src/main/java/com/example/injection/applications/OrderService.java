package com.example.injection.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
public class OrderService {

    @Autowired
    private ItemService itemService;


    public void hello() {
        System.out.println("hello");
    }

    // TODO R2 Runtime에서 순환참조 문제로 예기치 않은 StackOverFlowError가 발생
    public void circular() {
        itemService.circular();
    }
}
