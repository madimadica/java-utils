package com.madimadica.utils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Utility class to wrap common Collection transformations.
 */
public abstract class CollectionUtils {

    /**
     * Constructor to allow extension.
     */
    public CollectionUtils() {}

    /**
     * Attempt to return the first element in the collection, according to its {@link Iterator}.
     * Returns {@link Optional#empty()} if the input is empty,
     * {@code null}, or the element itself is {@code null}.
     * @param collection to get an element from.
     * @return the first element, if present.
     * @param <T> type of the elements in the Collection
     */
    public static <T> Optional<T> getFirst(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            return Optional.empty();
        }
        for (T t : collection) {
            return Optional.ofNullable(t);
        }
        return Optional.empty();
    }

    /**
     * Map an input collection to an output List.
     * <br>
     * Example: {@code List<Username> usernames = map(users, User::getUsername);}
     * @param collection containing the elements to map.
     * @param mappingFunction function remapping each element {@link X} to {@link Y}.
     * @return the list mapped by the function.
     * @param <X> type of the input {@code Collection}
     * @param <Y> type of the output {@code List}
     */
    public static <X, Y> List<Y> map(Collection<X> collection, Function<? super X, ? extends Y> mappingFunction) {
        return collection.stream().map(mappingFunction).collect(Collectors.toList());
    }

    /**
     * Map an input Collection to an output Set<br>
     * Example: {@code Set<String> uniqueLastNames = map(users, User::getLastName);}
     * @param collection containing the elements to map.
     * @param mappingFunction function remapping each element {@link X} to {@link Y}
     * @return the Set of mapped results
     * @param <X> type of the input {@code Collection}
     * @param <Y> type of the output {@code Set}
     */
    public static <X, Y> Set<Y> mapToSet(List<X> collection, Function<? super X, ? extends Y> mappingFunction) {
        return collection.stream().map(mappingFunction).collect(Collectors.toSet());
    }

    /**
     * Create a {@code Map} from an input {@code Collection} where the Entries' values are elements from the input collection.
     * <br>
     * Collisions will cause an {@link IllegalStateException}
     * <br>
     * Example: {@code Map<Long, User> userLookup = asMap(users, User::getId);}
     * @param collection Collection to create a Map from.
     * @param keyMappingFunction Function to get the key for a given element.
     * @return a Map with keys from {@code keyMappingFunction} and values of type {@link X}
     * @param <X> type of input collection elements.
     * @param <Y> type of output map keys.
     */
    public static <X, Y> Map<Y, X> asMap(Collection<X> collection, Function<? super X, ? extends Y> keyMappingFunction) {
        return collection.stream().collect(Collectors.toMap(keyMappingFunction, Function.identity()));
    }

    /**
     * Group an input collection by a mapped key into a Map of Lists by their key mappings.
     * <br>
     * Example {@code Map<String, List<User>> usersByLastName = groupBy(dataset, User::getLastName);}
     * @param collection input collection
     * @param groupClassifier Function to determine the correct group for each element.
     * @return Map where each entry has the group classifier and list of elements in the group.
     * @param <X> Type of input elements
     * @param <Y> Type of classifier
     */
    public static <X, Y> Map<Y, List<X>> groupBy(Collection<X> collection, Function<? super X, ? extends Y> groupClassifier) {
        return collection.stream().collect(Collectors.groupingBy(groupClassifier));
    }

    /**
     * Convert an {@link Iterable} into a {@link List}
     * @param iterable to convert
     * @return List of the iterable elements
     * @param <T> type of the elements
     */
    public static <T> List<T> toList(Iterable<T> iterable) {
        List<T> results = new ArrayList<>();
        for (T t : iterable) {
            results.add(t);
        }
        return results;
    }
}
