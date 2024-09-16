package com.madimadica.utils.list;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Static helper methods for dealing with Lists.
 * Return values are immutable (unmodifiable) lists.
 * <br>
 * Provides implemented default methods on List in Java 9+.
 *
 * @see List
 * @see MutableLists
 * @since 1.1
 */
public abstract class Lists {

    /**
     * Allow for user extension.
     */
    public Lists() {}

    /**
     * Return an unmodifiable list containing a variable number of elements.<br>
     * @param <T> the {@code List}'s element type
     * @param elements - the elements to be in the resulting list.
     * @return a {@code List} containing the arguments in order.
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
     * @return a {@code List} containing all the {@code Collection}'s elements.
     * @since 1.1
     */
    public static <T> List<T> copyOfNullable(Collection<? extends T> originalCollection) {
        List<T> result = new ArrayList<>(originalCollection.size());
        result.addAll(originalCollection);
        return Collections.unmodifiableList(result);
    }

}
