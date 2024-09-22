package com.madimadica.utils.list;

import java.util.*;

/**
 * Static helper methods for dealing with Lists.
 * Return values are immutable (unmodifiable) lists.
 * <br>
 * Provides implemented default methods on List in Java 9+.
 *
 * @see List
 * @since 1.1
 */
public abstract class Lists {

    /**
     * Allow for user extension.
     */
    public Lists() {}

    /**
     * Return an unmodifiable list containing a variable number of elements.<br>
     * The elements may be null.
     * @param <T> the {@code List}'s element type
     * @param elements the elements to be in the resulting list.
     * @return an unmodifiable {@code List} containing the arguments in order.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofNullable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> List<T> ofNullable(T... elements) {
        List<T> result = new ArrayList<>(elements.length);
        Collections.addAll(result, elements);
        return Collections.unmodifiableList(result);
    }

    /**
     * Return an unmodifiable list containing all the elements in the {@code originalCollection}
     * in their encounter order.<br>
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return an unmodifiable {@code List} containing all the {@code Collection}'s elements.
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> List<T> copyOfNullable(Collection<? extends T> originalCollection) {
        List<T> result = new ArrayList<>(originalCollection);
        return Collections.unmodifiableList(result);
    }

    /**
     * Return a modifiable list containing a variable number of elements.<br>
     * Elements may be null.
     * @param <T> the {@code List}'s element type
     * @param elements the elements to be in the resulting list.
     * @return a mutable {@code List} containing the arguments in order.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofMutable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> List<T> ofMutable(T... elements) {
        List<T> result = new ArrayList<>(elements.length);
        Collections.addAll(result, elements);
        return result;
    }

    /**
     * Return a mutable ArrayList containing all the elements in the {@code originalCollection}
     * in their encounter order.<br>
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a mutable {@code List} containing all the {@code Collection}'s elements.
     * @see java.util.ArrayList#ArrayList(Collection)
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> List<T> copyOfMutable(Collection<? extends T> originalCollection) {
        return new ArrayList<>(originalCollection);
    }
}
