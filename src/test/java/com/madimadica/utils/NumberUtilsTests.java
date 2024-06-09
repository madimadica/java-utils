package com.madimadica.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTests {

    @Test
    void intLength() {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; ++i) {
            assertEquals(String.valueOf(i).length(), NumberUtils.length(i));
        }
        assertEquals(String.valueOf(Integer.MAX_VALUE).length(), NumberUtils.length(Integer.MAX_VALUE));
    }


}
