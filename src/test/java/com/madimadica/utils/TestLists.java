package com.madimadica.utils;

import com.madimadica.utils.list.Lists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests for {@link Lists}
 */
public class TestLists {

    @Test
    void emptyList() {
        List<String> list = Lists.of();
        assertEquals(0, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add("Test"));
    }

    @Test
    void list1() {
        List<Integer> list = Lists.of(1);
        assertEquals(1, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list2() {
        List<Integer> list = Lists.of(1, 2);
        assertEquals(2, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list3() {
        List<Integer> list = Lists.of(1, 2, 3);
        assertEquals(3, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list4() {
        List<Integer> list = Lists.of(1, 2, 3, 4);
        assertEquals(4, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list5() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5);
        assertEquals(5, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list6() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6);
        assertEquals(6, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list7() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list8() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(8, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list9() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(9, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list10() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void list1_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of((Integer) null));
    }

    @Test
    void list2_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, null));
    }

    @Test
    void list3_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, null));
    }

    @Test
    void list4_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, null));
    }

    @Test
    void list5_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, null));
    }

    @Test
    void list6_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, 5, null));
    }

    @Test
    void list7_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, 5, 6, null));
    }

    @Test
    void list8_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, 5, 6, 7, null));
    }

    @Test
    void list9_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, 5, 6, 7, 8, null));
    }

    @Test
    void list10_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null));
    }

    @Test
    void listVarargs() {
        List<Integer> list = Lists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, list.size());
        assertThrows(UnsupportedOperationException.class, () -> list.add(0));
    }

    @Test
    void listVarargs_nullArgument() {
        assertThrows(NullPointerException.class, () -> Lists.of(1, 2, 3, 4, null, 6, 7, 8, 9, 10, 11));
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
    void copyOf() {
        List<Integer> original = Lists.of(1, 2, 3);
        List<Integer> copy = Lists.copyOf(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        assertThrows(UnsupportedOperationException.class, () -> copy.add(0));
    }

    @Test
    void copyOf_null() {
        List<Integer> original = Lists.ofNullable(1, null, 3);
        assertThrows(NullPointerException.class, () -> Lists.copyOf(original));
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
