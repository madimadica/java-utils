package com.madimadica.utils.set;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Sets}
 */
public class TestSets {

    @Test
    void emptyNullableSet() {
        Set<Integer> set = Sets.ofNullable();
        assertEquals(0, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet1Null() {
        Set<Integer> set = Sets.ofNullable((Integer) null);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet1() {
        Set<Integer> set = Sets.ofNullable(1);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet2() {
        Set<Integer> set = Sets.ofNullable(1, null);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSetDuplicates() {
        Set<Integer> set = Sets.ofNullable(1, null, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSetDuplicateNulls() {
        Set<Integer> set = Sets.ofNullable(1, null, null);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSetVarargs() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null, 11);
        assertEquals(11, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void copyOfNullable() {
        Set<Integer> original = Sets.ofNullable(1, null, 3);
        Set<Integer> copy = Sets.copyOfNullable(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        assertThrows(UnsupportedOperationException.class, () -> copy.add(0));
    }

    @Test
    void ofOrdered0() {
        Set<String> emptySet = Sets.ofOrdered();
        assertTrue(emptySet.isEmpty());
        assertThrows(UnsupportedOperationException.class, () -> emptySet.add("Error"));
    }

    @Test
    void ofOrdered1() {
        Set<Integer> set = Sets.ofOrdered(0);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofOrdered2() {
        Set<Integer> set = Sets.ofOrdered(0, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
    }

    @Test
    void ofOrdered3() {
        Set<Integer> set = Sets.ofOrdered(0, 1, 2);
        assertEquals(3, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
    }

    @Test
    void ofOrdered10() {
        Set<Integer> set = Sets.ofOrdered(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(10, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
        assertEquals(list.get(3), 3);
        assertEquals(list.get(4), 4);
        assertEquals(list.get(5), 5);
        assertEquals(list.get(6), 6);
        assertEquals(list.get(7), 7);
        assertEquals(list.get(8), 8);
        assertEquals(list.get(9), 9);
    }

    @Test
    void ofOrdered2_duplicates() {
        Set<Integer> set = Sets.ofOrdered(0, 0);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
    }

    @Test
    void ofOrdered3_duplicates() {
        Set<Integer> set = Sets.ofOrdered(0, 0, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
    }

    @Test
    void ofOrdered1_null() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(null));
    }

    @Test
    void ofOrdered2_null() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(0, null));
    }

    @Test
    void ofOrdered3_null() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(0, null, 2));
    }

    @Test
    void ofMutable0() {
        Set<Integer> set = Sets.ofMutable();
        assertTrue(set.isEmpty());
        set.add(0);
        assertEquals(set.size(), 1);
    }

    @Test
    void ofMutable1() {
        Set<Integer> set = Sets.ofMutable(0);
        assertEquals(set.size(), 1);
        set.add(1);
        assertEquals(set.size(), 2);
    }

    @Test
    void ofMutable2() {
        Set<Integer> set = Sets.ofMutable(0, 1);
        assertEquals(set.size(), 2);
        set.add(2);
        assertEquals(set.size(), 3);
    }

    @Test
    void ofMutable1_null_array() {
        Set<Integer> set = Sets.ofMutable(null);
        assertEquals(set.size(), 1);
        set.add(1);
        assertEquals(set.size(), 2);
    }

    @Test
    void ofMutable1_null_int() {
        Set<Integer> set = Sets.ofMutable((Integer) null);
        assertEquals(set.size(), 1);
        set.add(1);
        assertEquals(set.size(), 2);
    }

    @Test
    void ofMutable2_null() {
        Set<Integer> set = Sets.ofMutable(0, null);
        assertEquals(set.size(), 2);
        set.add(2);
        assertEquals(set.size(), 3);
    }
}
