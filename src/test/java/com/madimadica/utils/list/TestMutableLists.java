package com.madimadica.utils.list;

import com.madimadica.utils.list.MutableLists;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link com.madimadica.utils.list.MutableLists}
 */
public class TestMutableLists {

    @Test
    void emptyList() {
        List<Integer> list = MutableLists.of();
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    void list1() {
        List<Integer> list = MutableLists.of(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    void list2() {
        List<Integer> list = MutableLists.of(1, 2);
        assertEquals(2, list.size());
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void list3() {
        List<Integer> list = MutableLists.of(1, 2, 3);
        assertEquals(3, list.size());
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    void list4() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4);
        assertEquals(4, list.size());
        list.add(5);
        assertEquals(5, list.size());
    }

    @Test
    void list5() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5);
        assertEquals(5, list.size());
        list.add(6);
        assertEquals(6, list.size());
    }

    @Test
    void list6() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6);
        assertEquals(6, list.size());
        list.add(7);
        assertEquals(7, list.size());
    }

    @Test
    void list7() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, list.size());
        list.add(8);
        assertEquals(8, list.size());
    }

    @Test
    void list8() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(8, list.size());
        list.add(9);
        assertEquals(9, list.size());
    }

    @Test
    void list9() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(9, list.size());
        list.add(10);
        assertEquals(10, list.size());
    }

    @Test
    void list10() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, list.size());
        list.add(11);
        assertEquals(11, list.size());
    }

    @Test
    void listVarargs() {
        List<Integer> list = MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, list.size());
        list.add(12);
        assertEquals(12, list.size());
    }


    @Test
    void list1_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of((Integer) null));
    }

    @Test
    void list2_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, null));
    }

    @Test
    void list3_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, null));
    }

    @Test
    void list4_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, null));
    }

    @Test
    void list5_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, null));
    }

    @Test
    void list6_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, 5, null));
    }

    @Test
    void list7_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, 5, 6, null));
    }

    @Test
    void list8_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, 5, 6, 7, null));
    }

    @Test
    void list9_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8, null));
    }

    @Test
    void list10_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null));
    }

    @Test
    void listVarargs_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableLists.of(1, 2, 3, 4, null, 6, 7, 8, 9, 10, 11));
    }

    @Test
    void nullableList1() {
        List<Integer> list = MutableLists.ofNullable((Integer) null);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    void nullableList2() {
        List<Integer> list = MutableLists.ofNullable(1, null);
        assertEquals(2, list.size());
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    void nullableList3() {
        List<Integer> list = MutableLists.ofNullable(1, 2, null);
        assertEquals(3, list.size());
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    void nullableList4() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, null);
        assertEquals(4, list.size());
        list.add(5);
        assertEquals(5, list.size());
    }

    @Test
    void nullableList5() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, null);
        assertEquals(5, list.size());
        list.add(6);
        assertEquals(6, list.size());
    }

    @Test
    void nullableList6() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, null);
        assertEquals(6, list.size());
        list.add(7);
        assertEquals(7, list.size());
    }

    @Test
    void nullableList7() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, 6, null);
        assertEquals(7, list.size());
        list.add(8);
        assertEquals(8, list.size());
    }

    @Test
    void nullableList8() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, 6, 7, null);
        assertEquals(8, list.size());
        list.add(9);
        assertEquals(9, list.size());
    }

    @Test
    void nullableList9() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, null);
        assertEquals(9, list.size());
        list.add(10);
        assertEquals(10, list.size());
    }

    @Test
    void nullableList10() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
        assertEquals(10, list.size());
        list.add(11);
        assertEquals(11, list.size());
    }

    @Test
    void nullableListVarargs() {
        List<Integer> list = MutableLists.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null, 11);
        assertEquals(11, list.size());
        list.add(12);
        assertEquals(12, list.size());
    }

    @Test
    void copyOf() {
        List<Integer> original = MutableLists.of(1, 2, 3);
        List<Integer> copy = MutableLists.copyOf(original);
        assertEquals(original, copy);
        assertNotSame(original, copy);
        copy.add(4);
        assertNotEquals(original, copy);
    }

    @Test
    void copyOf_null() {
        List<Integer> original = MutableLists.ofNullable(1, null, 3);
        assertThrows(NullPointerException.class, () -> MutableLists.copyOf(original));
    }


    @Test
    void copyOfNullable() {
        List<Integer> original = MutableLists.ofNullable(1, null, 3);
        List<Integer> copy = MutableLists.copyOfNullable(original);
        assertEquals(original, copy);
        assertNotSame(original, copy);
        copy.add(4);
        assertNotEquals(original, copy);
    }
}
