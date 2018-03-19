package com.dpoletaev.sample;

import org.springframework.stereotype.Component;

@Component
public class DummyService {

    public String process(String input) {
        return "Hello, " + input;
    }
 }
