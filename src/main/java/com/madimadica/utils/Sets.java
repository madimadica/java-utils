package com.madimadica.utils;

import java.util.*;

/**
 * Static helper methods for dealing with Sets.
 * Return values are immutable (unmodifiable) sets.
 * <h2>Factory Properies</h2>
 * <p>
 *     A summary of the properties of the resulting set created by the static factory methods is
 *     described in this table. While not labeled in the table, this includes the equivalent {@code copyOf...} factories.
 * </p>
 * <table>
 *     <thead>
 *         <tr>
 *             <th>Name</th>
 *             <th>Nullable</th>
 *             <th>Mutable</th>
 *             <th>Ordered</th>
 *         </tr>
 *     </thead>
 *     <tbody>
 *         <tr>
 *             <td>java.util.Set#of</td>
 *             <td>no</td>
 *             <td>no</td>
 *             <td>no</td>
 *         </tr>
 *         <tr>
 *             <td>Sets#ofNullable</td>
 *             <td>yes</td>
 *             <td>no</td>
 *             <td>no</td>
 *         </tr>
 *         <tr>
 *             <td>Sets#ofMutable</td>
 *             <td>yes</td>
 *             <td>yes</td>
 *             <td>no</td>
 *         </tr>
 *         <tr>
 *             <td>Sets#ofOrdered</td>
 *             <td>no</td>
 *             <td>no</td>
 *             <td>yes</td>
 *         </tr>
 *         <tr>
 *             <td>Sets#ofOrderedNullable</td>
 *             <td>yes</td>
 *             <td>no</td>
 *             <td>yes</td>
 *         </tr>
 *         <tr>
 *             <td>Sets#ofOrderedMutable</td>
 *             <td>yes</td>
 *             <td>yes</td>
 *             <td>yes</td>
 *         </tr>
 *     </tbody>
 * </table>
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
     * Return an unmodifiable set containing all the unique elements in {@code originalCollection}.<br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.
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
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.
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

    /**
     * Return an unmodifiable set containing all the unique elements in {@code originalCollection}.
     * <br>
     * Allows duplicate arguments.<br>
     * Does <strong>not</strong> allow <code>null</code> arguments.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return an immutable, ordered {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if {@code originalCollection} is {@code null}, or any elements are null.
     * @since 1.1
     */
    public static <T> Set<T> copyOfOrdered(Collection<? extends T> originalCollection) {
        var set = new LinkedHashSet<>(originalCollection);
        if (set.contains(null)) {
            throw new NullPointerException("Collection to copy cannot contain nulls!");
        }
        return Collections.unmodifiableSet(set);
    }

    /**
     * Return an unmodifiable set containing all the unique elements in {@code originalCollection}.
     * <br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return an immutable, ordered {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfOrderedNullable(Collection<? extends T> originalCollection) {
        var set = new LinkedHashSet<>(originalCollection);
        return Collections.unmodifiableSet(set);
    }

    /**
     * Return a mutable set containing all the unique elements in {@code originalCollection}.
     * <br>
     * Allows duplicate arguments.<br>
     * Allows <code>null</code> arguments.
     * <br>
     * This is equivalent to invoking {@code new LinkedHashSet<>(originalCollection)}.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a mutable, ordered {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if {@code originalCollection} is {@code null}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfOrderedMutable(Collection<? extends T> originalCollection) {
        return new LinkedHashSet<>(originalCollection);
    }

}
