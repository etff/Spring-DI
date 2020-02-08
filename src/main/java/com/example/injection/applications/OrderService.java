package com.example.injection.applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
public class OrderService {

    private ItemService itemService;

    @Autowired
    public void setItem(ItemService itemService) {
        this.itemService = itemService;
    }

    // TODO R1. 낮은 결합도 방식이지만 여전히 runtime에서 NullPointerException이 발생
    public void change() {
        this.itemService = null;
    }

    public void hello() {
        itemService.hello();
    }
}
