package com.madimadica.utils;

import java.util.*;

/**
 * Static helper methods for dealing with Lists
 * <br>
 * Provides implemented default methods on List in Java 9+.
 *
 * @see java.util.List
 */
public abstract class Lists {

    /**
     * Allow for user extension.
     */
    public Lists() {}

    /**
     * Create an immutable list from a trusted source of elements (meaning they are all type T).
     * <br>
     * Elements cannot be null.
     * @param elements to insert into the list
     * @return immutable list containing the argument elements in the given order.
     * @param <T> expected type of each element.
     * @since 1.1
     */
    @SuppressWarnings("unchecked")
    private static <T> List<T> immutableListFactoryNonNull(Object... elements) {
        assert elements.getClass() == Object[].class;
        List<T> result = new ArrayList<>(elements.length);
        for (Object object : elements) {
            Objects.requireNonNull(object);
        }
        result.addAll(Arrays.asList((T[]) elements));
        return Collections.unmodifiableList(result);
    }

    /**
     * Create an immutable list from a trusted source of elements (meaning they are all type T).
     * @param elements to insert into the list
     * @return immutable list containing the argument elements in the given order.
     * @param <T> expected type of each element.
     * @since 1.1
     */
    @SuppressWarnings("unchecked")
    private static <T> List<T> immutableListFactoryNullable(Object... elements) {
        assert elements.getClass() == Object[].class;
        List<T> result = new ArrayList<>(elements.length);
        result.addAll(Arrays.asList((T[]) elements));
        return Collections.unmodifiableList(result);
    }

    /**
     * Return an unmodifiable list containing zero elements.
     * @param <T> the {@code List}'s element type
     * @return an empty {@code List}
     * @since 1.1
     */
    public static <T> List<T> of() {
        return Collections.emptyList();
    }

    /**
     * Return an unmodifiable list containing one element.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the single element
     * @return a {@code List} containing the single argument.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1) {
        return immutableListFactoryNonNull(t1);
    }

    /**
     * Return an unmodifiable list containing two elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2) {
        return immutableListFactoryNonNull(t1, t2);
    }

    /**
     * Return an unmodifiable list containing three elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3) {
        return immutableListFactoryNonNull(t1, t2, t3);
    }

    /**
     * Return an unmodifiable list containing four elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4) {
        return immutableListFactoryNonNull(t1, t2, t3, t4);
    }

    /**
     * Return an unmodifiable list containing five elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5);
    }

    /**
     * Return an unmodifiable list containing six elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5, T t6) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5, t6);
    }

    /**
     * Return an unmodifiable list containing seven elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5, t6, t7);
    }

    /**
     * Return an unmodifiable list containing eight elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Return an unmodifiable list containing nine elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    /**
     * Return an unmodifiable list containing ten elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
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
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    public static <T> List<T> of(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return immutableListFactoryNonNull(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    /**
     * Return an unmodifiable list containing a variable number of elements.<br>
     * Does not allow for null arguments.
     * @param <T> the {@code List}'s element type
     * @param elements - the elements to be in the resulting list.
     * @return a {@code List} containing the arguments in order.
     * @throws NullPointerException if any argument is null.
     * @since 1.1
     */
    @SafeVarargs
    public static <T> List<T> of(T... elements) {
        List<T> result = new ArrayList<>(elements.length);
        for (T t : elements) {
            Objects.requireNonNull(t);
        }
        result.addAll(Arrays.asList(elements));
        return Collections.unmodifiableList(result);
    }

    /**
     * Return an unmodifiable list containing all the elements in the {@code originalCollection}
     * in their encounter order.<br>
     * Elements cannot be null.
     * @param <T> type of collection elements
     * @param originalCollection collection to copy elements from.
     * @return a {@code List} containing all the {@code Collection}'s elements.
     * @throws NullPointerException if any element in the collection is null.
     * @since 1.1
     */
    public static <T> List<T> copyOf(Collection<? extends T> originalCollection) {
        List<T> result = new ArrayList<>(originalCollection.size());
        for (T t : originalCollection) {
            Objects.requireNonNull(t);
        }
        result.addAll(originalCollection);
        return result;
    }


    /**
     * Return an unmodifiable list containing one element.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the single element
     * @return a {@code List} containing the single argument.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1) {
        return immutableListFactoryNullable(t1);
    }

    /**
     * Return an unmodifiable list containing two elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2) {
        return immutableListFactoryNullable(t1, t2);
    }

    /**
     * Return an unmodifiable list containing three elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3) {
        return immutableListFactoryNullable(t1, t2, t3);
    }

    /**
     * Return an unmodifiable list containing four elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4) {
        return immutableListFactoryNullable(t1, t2, t3, t4);
    }

    /**
     * Return an unmodifiable list containing five elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5);
    }

    /**
     * Return an unmodifiable list containing six elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5, t6);
    }

    /**
     * Return an unmodifiable list containing seven elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5, t6, t7);
    }

    /**
     * Return an unmodifiable list containing eight elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    /**
     * Return an unmodifiable list containing nine elements.<br>
     * @param <T> the {@code List}'s element type
     * @param t1 the first element
     * @param t2 the second element
     * @param t3 the third element
     * @param t4 the fourth element
     * @param t5 the fifth element
     * @param t6 the sixth element
     * @param t7 the seventh element
     * @param t8 the eight element
     * @param t9 the ninth element
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    /**
     * Return an unmodifiable list containing ten elements.<br>
     * @param <T> the {@code List}'s element type
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
     * @return a {@code List} containing the arguments in order.
     * @since 1.1
     */
    public static <T> List<T> ofNullable(T t1, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return immutableListFactoryNullable(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

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
        result.addAll(Arrays.asList(elements));
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
        return result;
    }

}
