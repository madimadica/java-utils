package com.madimadica.utils;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for {@link Sets}
 */
public class SetsTests {

    @Test
    void ofNullable0() {
        Set<Integer> set = Sets.ofNullable();
        assertEquals(0, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable1() {
        Set<Integer> set = Sets.ofNullable(1);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable1_nullCast() {
        Set<Integer> set = Sets.ofNullable((Integer) null);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Sets.ofNullable(null));
    }

    @Test
    void ofNullable2() {
        Set<Integer> set = Sets.ofNullable(1, null);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable_duplicatesA() {
        Set<Integer> set = Sets.ofNullable(1, null, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable_duplicatesB() {
        Set<Integer> set = Sets.ofNullable(1, null, null);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofNullable_11() {
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
    void copyOfNullable_null() {
        assertThrows(NullPointerException.class, () -> Sets.copyOfNullable(null));
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
    void ofOrdered1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(null));
    }

    @Test
    void ofOrdered1_nullCast() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered((Integer) null));
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
    void ofOrdered2_null() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(0, null));
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
    void ofOrdered3_null() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrdered(0, null, 2));
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
    void ofOrdered_duplicatesA() {
        Set<Integer> set = Sets.ofOrdered(0, 0);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
    }

    @Test
    void ofOrdered_duplicatesB() {
        Set<Integer> set = Sets.ofOrdered(0, 0, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
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
    void ofMutable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Sets.ofMutable(null));
    }

    @Test
    void ofMutable1_nullCast() {
        Set<Integer> set = Sets.ofMutable((Integer) null);
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
    void ofMutable2_null() {
        Set<Integer> set = Sets.ofMutable(0, null);
        assertEquals(set.size(), 2);
        set.add(2);
        assertEquals(set.size(), 3);
    }

    @Test
    void ofMutable_duplicatesA() {
        Set<Integer> set = Sets.ofMutable(0, 1, 1, 1);
        assertEquals(set.size(), 2);
        set.add(2);
        assertEquals(set.size(), 3);
    }

    @Test
    void ofMutable_duplicatesB() {
        Set<Integer> set = Sets.ofMutable(0, null, null, null);
        assertEquals(set.size(), 2);
        set.add(2);
        assertEquals(set.size(), 3);
    }






    @Test
    void ofOrderedNullable0() {
        Set<String> emptySet = Sets.ofOrderedNullable();
        assertTrue(emptySet.isEmpty());
        assertThrows(UnsupportedOperationException.class, () -> emptySet.add("Error"));
    }

    @Test
    void ofOrderedNullable1() {
        Set<Integer> set = Sets.ofOrderedNullable(0);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofOrderedNullable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrderedNullable(null));
    }

    @Test
    void ofOrderedNullable1_nullCast() {
        Set<Integer> set = Sets.ofOrderedNullable((Integer) null);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
    }

    @Test
    void ofOrderedNullable2() {
        Set<Integer> set = Sets.ofOrderedNullable(0, null);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertNull(list.get(1));
    }

    @Test
    void ofOrderedNullable3() {
        Set<Integer> set = Sets.ofOrderedNullable(0, null, 2);
        assertEquals(3, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertNull(list.get(1));
        assertEquals(list.get(2), 2);
    }

    @Test
    void ofOrderedNullable10() {
        Set<Integer> set = Sets.ofOrderedNullable(0, 1, 2, 3, 4, null, 6, 7, 8, 9);
        assertEquals(10, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
        assertEquals(list.get(3), 3);
        assertEquals(list.get(4), 4);
        assertNull(list.get(5));
        assertEquals(list.get(6), 6);
        assertEquals(list.get(7), 7);
        assertEquals(list.get(8), 8);
        assertEquals(list.get(9), 9);
    }

    @Test
    void ofOrderedNullable_duplicatesA() {
        Set<Integer> set = Sets.ofOrderedNullable(0, 0);
        assertEquals(1, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
    }

    @Test
    void ofOrderedNullable_duplicatesB() {
        Set<Integer> set = Sets.ofOrderedNullable(0, 0, 1);
        assertEquals(2, set.size());
        assertThrows(UnsupportedOperationException.class, () -> set.add(0));
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
    }





    @Test
    void ofOrderedMutable0() {
        Set<Integer> set = Sets.ofOrderedMutable();
        assertTrue(set.isEmpty());
        set.add(0);
        assertEquals(set.size(), 1);
    }

    @Test
    void ofOrderedMutable1() {
        Set<Integer> set = Sets.ofOrderedMutable(0);
        assertEquals(1, set.size());
        set.add(1);
        assertEquals(set.size(), 2);
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
    }

    @Test
    void ofOrderedMutable1_nullLiteral() {
        assertThrows(NullPointerException.class, () -> Sets.ofOrderedMutable(null));
    }

    @Test
    void ofOrderedMutable1_nullCast() {
        Set<Integer> set = Sets.ofOrderedMutable((Integer) null);
        assertEquals(1, set.size());
        set.add(1);
        assertEquals(set.size(), 2);
        List<Integer> list = new ArrayList<>(set);
        assertNull(list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    void ofOrderedMutable2() {
        Set<Integer> set = Sets.ofOrderedMutable(0, 1);
        assertEquals(2, set.size());
        set.add(2);
        assertEquals(set.size(), 3);
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
    }


    @Test
    void ofOrderedMutable10() {
        Set<Integer> set = Sets.ofOrderedMutable(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(10, set.size());
        set.add(10);
        assertEquals(11, set.size());
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
        assertEquals(list.get(10), 10);
    }

    @Test
    void ofOrderedMutable_duplicatesA() {
        Set<Integer> set = Sets.ofOrderedMutable(0, 0);
        assertEquals(1, set.size());
        set.add(1);
        assertEquals(set.size(), 2);
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
    }

    @Test
    void ofOrderedMutable_duplicatesB() {
        Set<Integer> set = Sets.ofOrderedMutable(0, 1, 0);
        assertEquals(2, set.size());
        set.add(2);
        assertEquals(set.size(), 3);
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
    }

    @Test
    void ofOrderedMutable_duplicatesC() {
        Set<Integer> set = Sets.ofOrderedMutable(0, 1, 0, 2, 0, 3, 0, 4, 0, 5);
        assertEquals(6, set.size());
        set.add(6);
        assertEquals(7, set.size());
        List<Integer> list = new ArrayList<>(set);
        assertEquals(list.get(0), 0);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(2), 2);
        assertEquals(list.get(3), 3);
        assertEquals(list.get(4), 4);
        assertEquals(list.get(5), 5);
        assertEquals(list.get(6), 6);
    }

    private static List<Integer> getRandomDistinctList() {
        // Create 100k random values, then shuffle
        Set<Integer> randomNumbers = new HashSet<>(100_000);
        while (randomNumbers.size() < 100_000) {
            randomNumbers.add(
                    ThreadLocalRandom.current().nextInt(1_000_000)
            );
        }
        var randomList = new ArrayList<>(randomNumbers);
        Collections.shuffle(randomList);
        return randomList;
    }

    /**
     * Given a factory, create a random array of distinct integers, as the varargs,
     * and verify the resulting set has the same order.
     * @param setFactory static factory method
     */
    void assertOrderedSet(Function<Integer[], Set<Integer>> setFactory) {
        var list = getRandomDistinctList();
        Set<Integer> result = setFactory.apply(list.toArray(new Integer[] {}));
        int index = 0;
        for (Integer x : result) {
            assertEquals(list.get(index), x);
            index++;
        }
    }

    @Test
    void ofOrdered_isOrdered() {
        assertOrderedSet(Sets::ofOrdered);
    }

    @Test
    void ofOrderedNullable_isOrdered() {
        assertOrderedSet(Sets::ofOrderedNullable);
    }

    @Test
    void ofOrderedMutable_isOrdered() {
        assertOrderedSet(Sets::ofOrderedMutable);
    }

    @Test
    void copyOfMutable() {
        Set<Integer> original = Sets.ofMutable(1, null, 3);
        Set<Integer> copy = Sets.copyOfMutable(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        copy.add(5);
        assertNotEquals(original, copy);
    }

    @Test
    void copyOfOrdered() {
        Set<Integer> original = Sets.ofOrdered(1, 2, 3);
        Set<Integer> copy = Sets.copyOfOrdered(original);
        assertNotSame(original, copy);
        assertEquals(original, copy);
        assertThrows(UnsupportedOperationException.class, () -> copy.add(5));
    }
}
