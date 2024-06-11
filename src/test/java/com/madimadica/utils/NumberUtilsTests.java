package com.madimadica.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTests {

    @Test
    void intLengthFast() {
        // Could test all but it takes roughly 40 seconds
        for (int i = 1; i > 0; i *= 10) {
            for (int offset = -10; offset < 10; ++offset) {
                assertEquals(String.valueOf(i + offset).length(), NumberUtils.length(i + offset));
                assertEquals(String.valueOf(-i + offset).length(), NumberUtils.length(-i + offset));
            }
        }
        assertEquals(String.valueOf(Long.MIN_VALUE).length(), NumberUtils.length(Long.MIN_VALUE));
        assertEquals(String.valueOf(Long.MAX_VALUE).length(), NumberUtils.length(Long.MAX_VALUE));
    }

//    @Test
    void intLengthEveryInput() {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; ++i) {
            assertEquals(String.valueOf(i).length(), NumberUtils.length(i));
        }
        assertEquals(String.valueOf(Long.MIN_VALUE).length(), NumberUtils.length(Long.MIN_VALUE));
        assertEquals(String.valueOf(Long.MAX_VALUE).length(), NumberUtils.length(Long.MAX_VALUE));
    }

    @Test
    void longLengthFast() {
        // Cannot test every number without waiting forever (~3 billion minutes)
        // So just check that powers of 10 and surrounding numbers work
        for (long i = 1; i > 0; i *= 10) {
            for (int offset = -10; offset < 10; ++offset) {
                assertEquals(String.valueOf(i + offset).length(), NumberUtils.length(i + offset));
                assertEquals(String.valueOf(-i + offset).length(), NumberUtils.length(-i + offset));
            }
        }
        assertEquals(String.valueOf(Long.MIN_VALUE).length(), NumberUtils.length(Long.MIN_VALUE));
        assertEquals(String.valueOf(Long.MAX_VALUE).length(), NumberUtils.length(Long.MAX_VALUE));
    }

}
