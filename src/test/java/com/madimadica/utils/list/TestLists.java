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
