package com.dpoletaev.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacadeService {

    @Autowired
    private final DummyService dummyService;

    public FacadeService(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    public String process(String input) {
        return dummyService.process(input);
    }
}
