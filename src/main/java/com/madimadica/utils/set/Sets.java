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
     * Return a mutable set containing the unique arguments.<br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments, as mutability prevents null-safety.<br>
     * A single <code>null</code> argument is interpreted to be a
     * (mutable) singleton set containing <code>null</code>.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return a mutable {@code Set} containing the unique arguments.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofMutable(T... elements) {
        if (elements == null) {
            Set<T> nullSingleton = new HashSet<>();
            nullSingleton.add(null);
            return nullSingleton;
        } else {
            Set<T> result = new HashSet<>(elements.length);
            Collections.addAll(result, elements);
            return result;
        }
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
     * Return a mutable, sequenced set containing the unique arguments.<br>
     * Elements are ordered according to the argument ordering.<br>
     * Allows duplicate arguments; uses position of the first occurrence.<br>
     * Allows <code>null</code> arguments.
     *
     * @param <T> the {@code Set}'s element type
     * @param elements the elements to be in the resulting set.
     * @return an ordered, mutable {@code Set} containing the unique arguments.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofOrderedMutable(T... elements) {
        if (elements == null) {
            Set<T> nullSingleton = new HashSet<>();
            nullSingleton.add(null);
            return nullSingleton;
        } else {
            Set<T> result = new HashSet<>(elements.length);
            Collections.addAll(result, elements);
            return result;
        }
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
