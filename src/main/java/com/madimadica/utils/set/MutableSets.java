package com.madimadica.utils.set;

import java.util.*;

/**
 * Static helper methods for dealing with Sets.
 * Return values are mutable (modifiable) sets.
 *
 * @see Set
 * @see Sets
 * @since 1.1
 */
public class MutableSets {

    /**
     * Allow for user extension.
     */
    public MutableSets() {}

    /**
     * Create a mutable set from a trusted source of elements (meaning they are all type T).
     * <br>
     * Elements cannot be null.
     * @param elements to insert into the set
     * @return mutable set containing the unique argument elements in no particular order.
     * @param <T> expected type of each element.
     * @throws NullPointerException if any element is null
     * @since 1.1
     */
    @SuppressWarnings("unchecked")
    private static <T> Set<T> mutableSetFactoryNonNull(Object... elements) {
        assert elements.getClass() == Object[].class;
        Set<T> result = new HashSet<>(elements.length);
        for (Object object : elements) {
            Objects.requireNonNull(object);
        }
        result.addAll(Arrays.asList((T[]) elements));
        return result;
    }

    /**
     * Create a mutable set from a trusted source of elements (meaning they are all type T).
     * @param elements to insert into the set
     * @return mutable set containing the unique argument elements in no particular order.
     * @param <T> expected type of each element.
     * @since 1.1
     */
    @SuppressWarnings("unchecked")
    private static <T> Set<T> mutableSetFactoryNullable(Object... elements) {
        assert elements.getClass() == Object[].class;
        Set<T> result = new HashSet<>(elements.length);
        result.addAll(Arrays.asList((T[]) elements));
        return result;
    }


    /**
     * Return a modifiable set containing zero elements.
     * @param <T> the {@code Set}'s element type
     * @return an empty {@code Set}
     * @since 1.1
     */
    public static <T> Set<T> of() {
        return Collections.emptySet();
    }

    /**
     * Return a modifiable set containing one element.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the single element
     * @return a {@code Set} containing the single argument.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1) {
        return mutableSetFactoryNonNull(t1);
    }

    /**
     * Return a modifiable set containing (at most) two elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2) {
        return mutableSetFactoryNonNull(t1, t2);
    }

    /**
     * Return a modifiable set containing (at most) three elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3) {
        return mutableSetFactoryNonNull(t1, t2, t3);
    }

    /**
     * Return a modifiable set containing (at most) four elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4);
    }

    /**
     * Return a modifiable set containing (at most) five elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5);
    }

    /**
     * Return a modifiable set containing (at most) six elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5, T t6) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5, t6);
    }

    /**
     * Return a modifiable set containing (at most) seven elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5, t6, t7);
    }

    /**
     * Return a modifiable set containing (at most) eight elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Return a modifiable set containing (at most) nine elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    /**
     * Return a modifiable set containing (at most) ten elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @param t10 the tenth element
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> Set<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return mutableSetFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    /**
     * Return a modifiable set containing a variable number of unique elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code Set}'s element type
     * @param elements - the elements to be in the resulting set.
     * @return a {@code Set} containing the unique arguments.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> of(T... elements) {
        Set<T> result = new HashSet<>(elements.length);
        for (T t : elements) {
            Objects.requireNonNull(t);
        }
        result.addAll(Arrays.asList(elements));
        return result;
    }

    /**
     * Return a modifiable set containing all the unique elements in {@code originalCollection}.
     * Elements cannot be null.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a {@code Set} containing all the unique elements from the {@code Collection}.
     * @throws NullPointerException if any element in the collection is null.
     * @since 1.1
     */
    public static <T> Set<T> copyOf(Collection<? extends T> originalCollection) {
        Set<T> result = new HashSet<>(originalCollection.size());
        for (T t : originalCollection) {
            Objects.requireNonNull(t);
        }
        result.addAll(originalCollection);
        return result;
    }


    /**
     * Return a modifiable set containing one element.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the single element
     * @return a {@code Set} containing the single argument.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1) {
        return mutableSetFactoryNullable(t1);
    }

    /**
     * Return a modifiable set containing (at most) two elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2) {
        return mutableSetFactoryNullable(t1, t2);
    }

    /**
     * Return a modifiable set containing (at most) three elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3) {
        return mutableSetFactoryNullable(t1, t2, t3);
    }

    /**
     * Return a modifiable set containing (at most) four elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4) {
        return mutableSetFactoryNullable(t1, t2, t3, t4);
    }

    /**
     * Return a modifiable set containing (at most) five elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5);
    }

    /**
     * Return a modifiable set containing (at most) six elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5, t6);
    }

    /**
     * Return a modifiable set containing (at most) seven elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5, t6, t7);
    }

    /**
     * Return a modifiable set containing (at most) eight elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Return a modifiable set containing (at most) nine elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    /**
     * Return a modifiable set containing (at most) ten elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @param t10 the tenth element
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    public static <T> Set<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return mutableSetFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    /**
     * Return a modifiable set containing a variable number of unique elements.<br>
     * @param <T> the {@code Set}'s element type
     * @param elements - the elements to be in the resulting set.
     * @return a {@code Set} containing the unique arguments.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> Set<T> ofNullable(T... elements) {
        Set<T> result = new HashSet<>(elements.length);
        result.addAll(Arrays.asList(elements));
        return result;
    }

    /**
     * Return a modifiable set containing all the unique elements in {@code originalCollection}.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a {@code Set} containing all the unique elements from the {@code Collection}.
     * @since 1.1
     */
    public static <T> Set<T> copyOfNullable(Collection<? extends T> originalCollection) {
        Set<T> result = new HashSet<>(originalCollection.size());
        result.addAll(originalCollection);
        return result;
    }

}
