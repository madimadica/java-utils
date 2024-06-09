package com.madimadica.utils;

public class NumberUtils {

    /**
     * Computes what the length of the base 10 {@link String} representation
     * for the input value would be.
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
}
