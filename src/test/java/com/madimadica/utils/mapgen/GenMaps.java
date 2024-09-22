package com.madimadica.utils.mapgen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Generate the source code for Maps utils.
 */
public class GenMaps {

    static final int MAX_ENTRIES = 12;

    public static void main(String[] args) throws IOException {
        StringJoiner lines = new StringJoiner("\n");
        lines.add("package com.madimadica.utils;");
        lines.add("");
        lines.add("import java.util.Collections;");
        lines.add("import java.util.HashMap;");
        lines.add("import java.util.Map;");
        lines.add("");
        lines.add("/**");
        lines.add(" * Static utilities for Maps.");
        lines.add(" */");
        lines.add("public class Maps {");
        lines.add("");

        lines.add(getJavadocJoiner().add("Allow for user extension.").toString());
        lines.add("    public Maps() {}");
        lines.add("");
        lines.add(ofNullable());
        lines.add("");
        lines.add("}");
        lines.add("");
        Files.writeString(Paths.get("./src/main/java/com/madimadica/utils/Maps.java"), lines.toString());
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

    private static String ofNullable() {
        StringJoiner result = new StringJoiner("\n\n");
        for (int i = 1; i <= MAX_ENTRIES; ++i) {
            List<String> javadoc = List.of(
                    "Creates an immutable map with " + i + " " + (i == 1 ? "entry" : "entries") + ".",
                    "<br>",
                    "The values can be {@code null}, but keys must be non-null."
            );
            result.add(generate(i, "ofNullable", "HashMap", "Collections.unmodifiableMap(map)", javadoc));
        }
        return result.toString();
    }

    private static String generate(int entryCount, String methodName, String mapClass, String returnValue, List<String> javadocDesc) {
        StringJoiner javadoc = getJavadocJoiner();
        javadocDesc.forEach(javadoc::add);

        for (int i = 1; i <= entryCount; ++i) {
            javadoc.add("@param k" + i + " key for entry " + i);
            javadoc.add("@param v" + i + " value for entry " + i);
        }
        javadoc.add("@return An immutable map with the given entries.");
        javadoc.add("@param <K> key type");
        javadoc.add("@param <V> key type");
        javadoc.add("@throws NullPointerException if any key is {@code null}.");

        StringJoiner signatureSj = new StringJoiner(", ", "public static <K, V> Map<K, V> " + methodName + "(", ")");
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
        return methodSj.toString();
    }

}
