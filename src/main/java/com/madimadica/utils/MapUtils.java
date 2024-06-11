package com.madimadica.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to provide miscellaneous support for Maps.
 */
public abstract class MapUtils {

    /**
     * Constructor to allow extension.
     */
    public MapUtils() {}

    /**
     * Replace any number of keys from the {@code originalMap}
     * with the given updates in {@code keyUpdates}, while retaining the same values.
     * Keys with no replacements given retain the original mapping.
     * <br>
     * This returns a new, mutable HashMap.
     * <br>
     * Example: {@code rekey(Map.of("foo", "bar"), Map.of("foo", "baz")) => Map.of("baz", "bar");}
     * @param originalMap Map to use for key-value associations
     * @param keyUpdates  Map to use for replacing keys.
     * @return a new Map with the key remappings applied.
     * @param <K> type of map keys
     * @param <V> type of map values
     */
    public static <K, V> Map<K, V> rekey(Map<K, V> originalMap, Map<K, K> keyUpdates) {
        Map<K, V> result = new HashMap<>();
        for (var entry : originalMap.entrySet()) {
            K key = entry.getKey();
            result.put(
                    keyUpdates.getOrDefault(key, key),
                    entry.getValue()
            );
        }
        return result;
    }

}
