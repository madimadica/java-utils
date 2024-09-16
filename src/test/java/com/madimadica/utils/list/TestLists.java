package com.madimadica.utils.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests for {@link Lists}
 */
public class TestLists {

    @Test
    void emptyNullableList() {
        List<Integer> list = Lists.ofNullable();
        assertEquals(0, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList1() {
        List<Integer> list = Lists.ofNullable((Integer) null);
        assertEquals(1, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList2() {
        List<Integer> list = Lists.ofNullable(1, null);
        assertEquals(2, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList3() {
        List<Integer> list = Lists.ofNullable(1, 2, null);
        assertEquals(3, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList4() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, null);
        assertEquals(4, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList5() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, null);
        assertEquals(5, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList6() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, null);
        assertEquals(6, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList7() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, 6, null);
        assertEquals(7, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList8() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, 6, 7, null);
        assertEquals(8, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList9() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, null);
        assertEquals(9, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableList10() {
        List<Integer> list = Lists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
        assertEquals(10, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void nullableListVarargs() {
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

}
