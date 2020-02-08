package com.example.injection.applications;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
@AllArgsConstructor
public class OrderService {
    private final ItemService itemService;

    public void hello() {
        itemService.hello();
    }
}
