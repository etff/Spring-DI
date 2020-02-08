package com.example.injection.applications;

import org.springframework.stereotype.Service;

/**
 * @author hwang-yunho on 2020. 2. 8.
 * @project injection
 */
@Service
public class ItemService {
    public void hello() {
        System.out.println("hello");
    }
}
