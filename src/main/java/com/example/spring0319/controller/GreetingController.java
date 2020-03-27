package com.example.spring0319.controller;

import com.example.spring0319.vo.GreetingVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingVO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingVO(counter.incrementAndGet(), String.format(template, name));
    }
}
