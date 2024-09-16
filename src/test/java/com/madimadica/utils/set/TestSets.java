package com.madimadica.utils.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

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
    
}
