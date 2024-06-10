package com.madimadica.utils;

import java.util.HashMap;
import java.util.Map;

public abstract class MapUtils {

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
