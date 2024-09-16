package com.madimadica.utils.set;

import java.util.*;

/**
 * Static helper methods for dealing with Sets.
 * Return values are immutable (unmodifiable) sets.
 * <br>
 * Provides implemented default methods on Sets in Java 9+.
 *
 * @see Set
 * @see MutableSets
 * @since 1.1
 */
public abstract class Sets {

    /**
     * Allow for user extension.
     */
    public Sets() {}

    /**
     * Return an unmodifiable set containing a variable number of unique elements.<br>
     * Allows duplicate arguments.
     * @param <T> the {@code Set}'s element type
     * @param elements - the elements to be in the resulting set.
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofNullable(T... elements) {
        Set<T> result = new HashSet<>(elements.length);
        Collections.addAll(result, elements);
        return Collections.unmodifiableSet(result);
    }

    /**
     * Return an unmodifiable, sequenced set containing a variable number of unique elements.<br>
     * Elements are ordered according to the argument ordering.<br>
     * Allows duplicate arguments.<br>
     * Does <strong>not</strong> allow <code>null</code> arguments.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements - the elements to be in the resulting set.
     * @throws NullPointerException if any element is null.
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofOrdered(T... elements) {
        final int len = elements.length;
        Set<T> result = new LinkedHashSet<>(len);
        for (int i = 0; i < len; ++i) {
            if (elements[i] == null) {
                throw new NullPointerException("Element at index " + i + " is null");
            }
        }
        Collections.addAll(result, elements);
        return Collections.unmodifiableSet(result);
    }

    /**
     * Return an unmodifiable set containing all the unique elements in {@code originalCollection}.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a {@code Set} containing all the unique elements from the {@code Collection}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfNullable(Collection<? extends T> originalCollection) {
        Set<T> result = new HashSet<>(originalCollection.size());
        result.addAll(originalCollection);
        return Collections.unmodifiableSet(result);
    }

}
