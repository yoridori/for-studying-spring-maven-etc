package com.example.forstudyingspringmavenetc.controller;

import com.example.forstudyingspringmavenetc.service.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SampleController {

    private final SampleService service;
    SampleController(SampleService service){
        this.service = service;
    }

    @GetMapping("/sample")
    public String getSample() {
        return service.getSample();
    }
}
