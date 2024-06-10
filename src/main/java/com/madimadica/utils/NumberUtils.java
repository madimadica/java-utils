package com.madimadica.utils;

public class NumberUtils {

    /**
     * Computes the length of the base 10
     * {@link String} representation for a 32-bit {@code int}.
     * @param x number to compute the length of.
     * @return length of the number.
     */
    public static int length(int x) {
        if (x < 0) {
            if (x > -10) {
                return 2;
            } else if (x > -100) {
                return 3;
            } else if (x > -1_000) {
                return 4;
            } else if (x > -10_000) {
                return 5;
            } else if (x > -100_000) {
                return 6;
            } else if (x > -1_000_000) {
                return 7;
            } else if (x > -10_000_000) {
                return 8;
            } else if (x > -100_000_000) {
                return 9;
            } else if (x > -1_000_000_000) {
                return 10;
            } else {
                return 11;
            }
        } else {
            if (x < 10) {
                return 1;
            } else if (x < 100) {
                return 2;
            } else if (x < 1_000) {
                return 3;
            } else if (x < 10_000) {
                return 4;
            } else if (x < 100_000) {
                return 5;
            } else if (x < 1_000_000) {
                return 6;
            } else if (x < 10_000_000) {
                return 7;
            } else if (x < 100_000_000) {
                return 8;
            } else if (x < 1_000_000_000) {
                return 9;
            } else {
                return 10;
            }
        }

    }

    /**
     * Computes the length of the base 10
     * {@link String} representation for a 64-bit {@code long}.
     * @param x number to compute the length of.
     * @return length of the number.
     */
    public static int length(long x) {
        if (x < 0L) {
            if (x > -10L) {
                return 2;
            } else if (x > -100L) {
                return 3;
            } else if (x > -1_000L) {
                return 4;
            } else if (x > -10_000L) {
                return 5;
            } else if (x > -100_000L) {
                return 6;
            } else if (x > -1_000_000L) {
                return 7;
            } else if (x > -10_000_000L) {
                return 8;
            } else if (x > -100_000_000L) {
                return 9;
            } else if (x > -1_000_000_000L) {
                return 10;
            } else if (x > -10_000_000_000L) {
                return 11;
            } else if (x > -100_000_000_000L) {
                return 12;
            } else if (x > -1_000_000_000_000L) {
                return 13;
            } else if (x > -10_000_000_000_000L) {
                return 14;
            } else if (x > -100_000_000_000_000L) {
                return 15;
            } else if (x > -1_000_000_000_000_000L) {
                return 16;
            } else if (x > -10_000_000_000_000_000L) {
                return 17;
            } else if (x > -100_000_000_000_000_000L) {
                return 18;
            } else if (x > -1_000_000_000_000_000_000L) {
                return 19;
            } else {
                return 20;
            }
        } else {
            if (x < 10L) {
                return 1;
            } else if (x < 100L) {
                return 2;
            } else if (x < 1_000L) {
                return 3;
            } else if (x < 10_000L) {
                return 4;
            } else if (x < 100_000L) {
                return 5;
            } else if (x < 1_000_000L) {
                return 6;
            } else if (x < 10_000_000L) {
                return 7;
            } else if (x < 100_000_000L) {
                return 8;
            } else if (x < 1_000_000_000L) {
                return 9;
            } else if (x < 10_000_000_000L) {
                return 10;
            } else if (x < 100_000_000_000L) {
                return 11;
            } else if (x < 1_000_000_000_000L) {
                return 12;
            } else if (x < 10_000_000_000_000L) {
                return 13;
            } else if (x < 100_000_000_000_000L) {
                return 14;
            } else if (x < 1_000_000_000_000_000L) {
                return 15;
            } else if (x < 10_000_000_000_000_000L) {
                return 16;
            } else if (x < 100_000_000_000_000_000L) {
                return 17;
            } else if (x < 1_000_000_000_000_000_000L) {
                return 18;
            } else {
                return 19;
            }
        }

    }

}
