package com.madimadica.utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests for {@link Lists}
 */
public class ListsTests {

    @Test
    void ofNullable0() {
        List<Integer> list = Lists.ofNullable();
        assertEquals(0, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void ofNullable1() {
        List<Integer> list = Lists.ofNullable(0);
        assertEquals(1, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void ofNullable1_nullCast() {
        List<Integer> list = Lists.ofNullable((Integer) null);
        assertEquals(1, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void ofNullable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Lists.ofNullable(null));
    }

    @Test
    void ofNullable2() {
        List<Integer> list = Lists.ofNullable(1, null);
        assertEquals(2, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void ofNullable3() {
        List<Integer> list = Lists.ofNullable(1, 2, null);
        assertEquals(3, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void ofNullable11() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null, 11);
        assertEquals(11, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void copyOfNullable() {
        List<Integer> original = Lists.ofNullable(1, null, 3);
        List<Integer> copy = Lists.copyOfNullable(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        assertThrows(UnsupportedOperationException.class, () -> copy.add(0));
    }

    @Test
    void copyOfNullable_null() {
        assertThrows(NullPointerException.class, () -> Lists.copyOfNullable(null));
    }





    @Test
    void ofMutable0() {
        List<Integer> list = Lists.ofMutable();
        assertEquals(0, list.size());
        list.add(0);
        assertEquals(1, list.size());
        assertEquals(0, list.get(0));
    }

    @Test
    void ofMutable1() {
        List<Integer> list = Lists.ofMutable(0);
        assertEquals(1, list.size());
        list.add(1);
        assertEquals(2, list.size());
        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    void ofMutable1_nullCast() {
        List<Integer> list = Lists.ofMutable((Integer) null);
        assertEquals(1, list.size());
        list.add(1);
        assertEquals(2, list.size());
        assertNull(list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    void ofMutableList1_nullofMutable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Lists.ofMutable(null));
    }

    @Test
    void ofMutable2() {
        List<Integer> list = Lists.ofMutable(0, 1);
        assertEquals(2, list.size());
        list.add(2);
        assertEquals(3, list.size());
        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
        assertEquals(2, list.get(2));
    }

    @Test
    void copyOfMutable() {
        List<Integer> original = Lists.ofMutable(1, null, 3);
        List<Integer> copy = Lists.copyOfMutable(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        copy.add(4);
        assertNotEquals(original, copy);
        assertEquals(4, copy.get(3));
    }

    @Test
    void copyOfMutable_null() {
        assertThrows(NullPointerException.class, () -> Lists.copyOfMutable(null));
    }

}
