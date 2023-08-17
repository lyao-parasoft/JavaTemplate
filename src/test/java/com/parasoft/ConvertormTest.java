package com.parasoft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertormTest {

    @Test
    void convertToString1() {
        Convertorm convertorm = new Convertorm();
        String result = convertorm.nickname();
        assertEquals("number to string convertor", result);
    }
}