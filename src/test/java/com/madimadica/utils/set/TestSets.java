package com.madimadica.utils.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Sets}
 */
public class TestSets {

    @Test
    void emptySet() {
        Set<String> set = Sets.of();
        assertEquals(0, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add("Test"));
    }

    @Test
    void set1() {
        Set<Integer> set = Sets.of(1);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set2() {
        Set<Integer> set = Sets.of(1, 2);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set3() {
        Set<Integer> set = Sets.of(1, 2, 3);
        assertEquals(3, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set4() {
        Set<Integer> set = Sets.of(1, 2, 3, 4);
        assertEquals(4, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set5() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5);
        assertEquals(5, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set6() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6);
        assertEquals(6, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set7() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set8() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(8, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set9() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(9, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set10() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void set1_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of((Integer) null));
    }

    @Test
    void set2_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, null));
    }

    @Test
    void set3_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, null));
    }

    @Test
    void set4_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, null));
    }

    @Test
    void set5_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, null));
    }

    @Test
    void set6_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, 5, null));
    }

    @Test
    void set7_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, 5, 6, null));
    }

    @Test
    void set8_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, 5, 6, 7, null));
    }

    @Test
    void set9_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, 5, 6, 7, 8, null));
    }

    @Test
    void set10_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null));
    }

    @Test
    void setVarargs() {
        Set<Integer> set = Sets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void setVarargs_nullArgument() {
        assertThrows(NullPointerException.class, () -> Sets.of(1, 2, 3, 4, null, 6, 7, 8, 9, 10, 11));
    }

    @Test
    void nullableSet1() {
        Set<Integer> set = Sets.ofNullable((Integer) null);
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
    void nullableSet3() {
        Set<Integer> set = Sets.ofNullable(1, 2, null);
        assertEquals(3, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet4() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, null);
        assertEquals(4, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet5() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, null);
        assertEquals(5, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet6() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, null);
        assertEquals(6, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet7() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, null);
        assertEquals(7, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet8() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, 7, null);
        assertEquals(8, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet9() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, null);
        assertEquals(9, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSet10() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
        assertEquals(10, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void nullableSetVarargs() {
        Set<Integer> set = Sets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null, 11);
        assertEquals(11, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void copyOf() {
        Set<Integer> original = Sets.of(1, 2, 3);
        Set<Integer> copy = Sets.copyOf(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        assertThrows(UnsupportedOperationException.class, () -> copy.add(0));
    }

    @Test
    void copyOf_null() {
        Set<Integer> original = Sets.ofNullable(1, null, 3);
        assertThrows(NullPointerException.class, () -> Sets.copyOf(original));
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
