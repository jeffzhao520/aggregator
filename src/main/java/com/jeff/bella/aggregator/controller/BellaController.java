package com.jeff.bella.aggregator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeff.
 */
@RestController
public class BellaController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World! This is Jeff.";
    }
}

