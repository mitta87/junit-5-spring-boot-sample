package com.dpoletaev.sample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DummyServiceTest {
    @Test
    void process() {
        DummyService service = new DummyService();
        String actual = service.process("John");

        assertEquals("Hello, John!", actual);
    }

}