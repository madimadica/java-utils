package com.madimadica.utils.set;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestMutableSets {


    @Test
    void emptyset() {
        Set<Integer> set = MutableSets.of();
        assertEquals(0, set.size());
        set.add(1);
        assertEquals(1, set.size());
    }

    @Test
    void set1() {
        Set<Integer> set = MutableSets.of(1);
        assertEquals(1, set.size());
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    void set2() {
        Set<Integer> set = MutableSets.of(1, 2);
        assertEquals(2, set.size());
        set.add(3);
        assertEquals(3, set.size());
    }

    @Test
    void set3() {
        Set<Integer> set = MutableSets.of(1, 2, 3);
        assertEquals(3, set.size());
        set.add(4);
        assertEquals(4, set.size());
    }

    @Test
    void set4() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4);
        assertEquals(4, set.size());
        set.add(5);
        assertEquals(5, set.size());
    }

    @Test
    void set5() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5);
        assertEquals(5, set.size());
        set.add(6);
        assertEquals(6, set.size());
    }

    @Test
    void set6() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6);
        assertEquals(6, set.size());
        set.add(7);
        assertEquals(7, set.size());
    }

    @Test
    void set7() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(7, set.size());
        set.add(8);
        assertEquals(8, set.size());
    }

    @Test
    void set8() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(8, set.size());
        set.add(9);
        assertEquals(9, set.size());
    }

    @Test
    void set9() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(9, set.size());
        set.add(10);
        assertEquals(10, set.size());
    }

    @Test
    void set10() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, set.size());
        set.add(11);
        assertEquals(11, set.size());
    }

    @Test
    void setVarargs() {
        Set<Integer> set = MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, set.size());
        set.add(12);
        assertEquals(12, set.size());
    }


    @Test
    void set1_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of((Integer) null));
    }

    @Test
    void set2_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, null));
    }

    @Test
    void set3_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, null));
    }

    @Test
    void set4_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, null));
    }

    @Test
    void set5_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, null));
    }

    @Test
    void set6_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, 5, null));
    }

    @Test
    void set7_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, 5, 6, null));
    }

    @Test
    void set8_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, 5, 6, 7, null));
    }

    @Test
    void set9_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8, null));
    }

    @Test
    void set10_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, 5, 6, 7, 8, 9, null));
    }

    @Test
    void setVarargs_nullArgument() {
        assertThrows(NullPointerException.class, () -> MutableSets.of(1, 2, 3, 4, null, 6, 7, 8, 9, 10, 11));
    }

    @Test
    void nullableSet1() {
        Set<Integer> set = MutableSets.ofNullable((Integer) null);
        assertEquals(1, set.size());
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    void nullableSet2() {
        Set<Integer> set = MutableSets.ofNullable(1, null);
        assertEquals(2, set.size());
        set.add(3);
        assertEquals(3, set.size());
    }

    @Test
    void nullableSet3() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, null);
        assertEquals(3, set.size());
        set.add(4);
        assertEquals(4, set.size());
    }

    @Test
    void nullableSet4() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, null);
        assertEquals(4, set.size());
        set.add(5);
        assertEquals(5, set.size());
    }

    @Test
    void nullableSet5() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, null);
        assertEquals(5, set.size());
        set.add(6);
        assertEquals(6, set.size());
    }

    @Test
    void nullableSet6() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, null);
        assertEquals(6, set.size());
        set.add(7);
        assertEquals(7, set.size());
    }

    @Test
    void nullableSet7() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, 6, null);
        assertEquals(7, set.size());
        set.add(8);
        assertEquals(8, set.size());
    }

    @Test
    void nullableSet8() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, 6, 7, null);
        assertEquals(8, set.size());
        set.add(9);
        assertEquals(9, set.size());
    }

    @Test
    void nullableSet9() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, null);
        assertEquals(9, set.size());
        set.add(10);
        assertEquals(10, set.size());
    }

    @Test
    void nullableSet10() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null);
        assertEquals(10, set.size());
        set.add(11);
        assertEquals(11, set.size());
    }

    @Test
    void nullableSetVarargs() {
        Set<Integer> set = MutableSets.ofNullable(1, 2, 3, 4, 5, 6, 7, 8, 9, null, 11);
        assertEquals(11, set.size());
        set.add(12);
        assertEquals(12, set.size());
    }

    @Test
    void copyOf() {
        Set<Integer> original = MutableSets.of(1, 2, 3);
        Set<Integer> copy = MutableSets.copyOf(original);
        assertEquals(original, copy);
        assertNotSame(original, copy);
        copy.add(4);
        assertNotEquals(original, copy);
    }

    @Test
    void copyOf_null() {
        Set<Integer> original = MutableSets.ofNullable(1, null, 3);
        assertThrows(NullPointerException.class, () -> MutableSets.copyOf(original));
    }


    @Test
    void copyOfNullable() {
        Set<Integer> original = MutableSets.ofNullable(1, null, 3);
        Set<Integer> copy = MutableSets.copyOfNullable(original);
        assertEquals(original, copy);
        assertNotSame(original, copy);
        copy.add(4);
        assertNotEquals(original, copy);
    }
    
}
