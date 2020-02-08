package com.example.injection.interfaces;

import com.example.injection.applications.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@RestController
public class TestController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public void test() {
        // TODO R1 @Component가 mutable 하기 때문에 NullPointerException으로 부터 안전하지 않음
        // itemService.mutable();
        // TODO R2 Runtime에서 순환참조 문제로 예기치 않은 StackOverFlowError가 발생
        //itemService.circular();
    }
}
