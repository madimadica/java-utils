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
        result.addAll(Arrays.asList(elements));
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
