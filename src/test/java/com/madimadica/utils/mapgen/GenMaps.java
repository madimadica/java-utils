package com.madimadica.utils.mapgen;

import java.util.*;

/**
 * Generate the source code for Maps utils.
 */
public class GenMaps {

    static final int MAX_ENTRIES = 12;

    public static void main(String[] args) {
        ofNullable();
    }

    private static String assertNonNullKeys(int keyCount) {
        StringJoiner nonNullIf = new StringJoiner(
                " || ",
                "        if (", ") {\n            throw new NullPointerException(\"Map keys cannot be null\");\n        }"
        );
        for (int i = 1; i <= keyCount; ++i) {
            nonNullIf.add("k" + i + " == null");
        }
        return nonNullIf.toString();
    }

    private static StringJoiner getJavadocJoiner() {
        return new StringJoiner("\n     * ", "    /**\n     * ", "\n     */");
    }

    private static void ofNullable() {
        for (int i = 1; i <= MAX_ENTRIES; ++i) {
            ofNullable(i);
            System.out.println();
        }

    }

    private static void ofNullable(int entryCount) {
        generate(entryCount, "HashMap", "Collections.unmodifiableMap(map)");
    }

    private static void generate(int entryCount, String mapClass, String returnValue) {
        StringJoiner javadoc = getJavadocJoiner();
        javadoc.add("Creates an immutable map with " + entryCount + " " + (entryCount == 1 ? "entry" : "entries") + ".");
        javadoc.add("<br>");
        javadoc.add("The values can be {@code null}, but keys must be non-null.");

        for (int i = 1; i <= entryCount; ++i) {
            javadoc.add("@param k" + i + " key for entry " + i);
            javadoc.add("@param v" + i + " value for entry " + i);
        }
        javadoc.add("@return An immutable map with the given entries.");
        javadoc.add("@param <K> key type");
        javadoc.add("@param <K> key type");
        javadoc.add("@throws NullPointerException if any key is {@code null}.");

        StringJoiner signatureSj = new StringJoiner(", ", "public static <K, V> Map<K, V> ofNullable(", ")");
        for (int j = 1; j <= entryCount; ++j) {
            String entryPair = String.format("K k%d, V v%<d", j);
            signatureSj.add(entryPair);
        }
        String signature = signatureSj.toString();
        StringJoiner methodSj = new StringJoiner("\n", javadoc + "\n    " + signature + " {\n", "\n    }");
        methodSj.add(assertNonNullKeys(entryCount));
        methodSj.add("        Map<K, V> map = new " + mapClass + "<>(" + entryCount + ");");
        for (int entryNumber = 1; entryNumber <= entryCount; ++entryNumber) {
            methodSj.add(String.format("        map.put(k%d, v%<d);", entryNumber));
        }
        methodSj.add("        return " + returnValue + ";");
        System.out.println(methodSj);
    }

}
