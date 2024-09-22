package com.madimadica.utils;

import java.util.*;

/**
 * Static helper methods for dealing with Sets.
 * Return values are immutable (unmodifiable) sets.
 * <br>
 * Provides implemented default methods on Sets in Java 9+.
 *
 * @see Set
 * @since 1.1
 */
public abstract class Sets {

    /**
     * Allow for user extension.
     */
    public Sets() {}

    /**
     * Return an unmodifiable set containing the unique arguments.<br>
     * Allows duplicate arguments.<br>
     * Allows {@code null} arguments.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return an immutable {@code Set} containing the unique arguments.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofNullable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofNullable(T... elements) {
        Set<T> result = new HashSet<>(elements.length);
        Collections.addAll(result, elements);
        return Collections.unmodifiableSet(result);
    }

    /**
     * Return a mutable set containing the unique arguments.<br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return a mutable {@code Set} containing the unique arguments.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofMutable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofMutable(T... elements) {
        Set<T> result = new HashSet<>(elements.length);
        Collections.addAll(result, elements);
        return result;
    }

    /**
     * Return an unmodifiable, sequenced set containing the unique arguments in their given order.<br>
     * Allows duplicate arguments.<br>
     * Does <strong>not</strong> allow <code>null</code> arguments.<br>
     * For any duplicate elements, the first occurrence is used as the ordered position.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return an immutable {@code Set} containing the unique arguments.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofOrdered(null)}, or if any element is {@code null}.
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
     * Return an unmodifiable sequenced set containing the unique arguments in their given order.<br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.<br>
     * For any duplicate elements, the first occurrence is used as the ordered position.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return an ordered, immutable {@code Set} containing the unique arguments.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofOrderedNullable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofOrderedNullable(T... elements) {
        Set<T> result = new LinkedHashSet<>(elements.length);
        Collections.addAll(result, elements);
        return Collections.unmodifiableSet(result);
    }


    /**
     * Return a mutable, sequenced set containing the unique arguments in their given order.<br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.<br>
     * For any duplicate elements, the first occurrence is used as the ordered position.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return an ordered, mutable {@code Set} containing the unique arguments.
     * @throws NullPointerException if {@code elements} is {@code null}, i.e. {@code ofOrderedMutable(null)}.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofOrderedMutable(T... elements) {
        Set<T> result = new LinkedHashSet<>(elements.length);
        Collections.addAll(result, elements);
        return result;
    }

    /**
     * Return an unmodifiable set containing all the unique elements in {@code originalCollection}.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return an immutable {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfNullable(Collection<? extends T> originalCollection) {
        Set<T> result = new HashSet<>(originalCollection);
        return Collections.unmodifiableSet(result);
    }

    /**
     * Return a mutable set containing all the unique elements in {@code originalCollection}.
     * <br>
     * This is equivalent to invoking {@code new HashSet<>(originalCollection)}.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a mutable {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfMutable(Collection<? extends T> originalCollection) {
        return new HashSet<>(originalCollection);
    }


}
