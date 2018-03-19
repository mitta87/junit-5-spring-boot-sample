package com.dpoletaev.sample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class FacadeServiceTest {

    private static final String INPUT = "Mike";
    private static final String MOCK_OUT = "Hello";

    @Mock
    private DummyService dummyService;

    private FacadeService service;

    @BeforeEach
    void setUp() {
        service = new FacadeService(dummyService);
        when(dummyService.process(INPUT)).thenReturn(MOCK_OUT);
    }

    @Test
    void test() {
        String actual = service.process(INPUT);

        assertEquals(actual, MOCK_OUT);
    }
}