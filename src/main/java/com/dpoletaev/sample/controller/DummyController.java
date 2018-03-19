package com.dpoletaev.sample.controller;

import com.dpoletaev.sample.FacadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dummy")
public class DummyController {

    @Autowired
    private FacadeService service;

    @GetMapping
    public String hello() {
        return service.process("John");
    }
}
