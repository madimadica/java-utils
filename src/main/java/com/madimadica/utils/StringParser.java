package com.madimadica.utils;

import java.util.Optional;

/**
 * Static utilities to parse Strings into Optional results.
 */
public abstract class StringParser {

    /**
     * Constructor to allow extension.
     */
    public StringParser() {}

    /**
     * Attempts to parse the string argument into a byte.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Byte>} represented by the string argument.
     * @see Byte#parseByte(String) 
     */
    public static Optional<Byte> parseByte(String s) {
        try {
            return Optional.of(Byte.parseByte(s));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a byte.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @param radix the radix to be used while parsing
     * @return an {@link Optional<Byte>} represented by the string argument.
     * @see Byte#parseByte(String, int)
     */
    public static Optional<Byte> parseByte(String s, int radix) {
        try {
            return Optional.of(Byte.parseByte(s, radix));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a short.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Short>} represented by the string argument.
     * @see Short#parseShort(String)
     */
    public static Optional<Short> parseShort(String s) {
        try {
            return Optional.of(Short.parseShort(s));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a short.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @param radix the radix to be used while parsing
     * @return an {@link Optional<Short>} represented by the string argument.
     * @see Short#parseShort(String, int)
     */
    public static Optional<Short> parseShort(String s, int radix) {
        try {
            return Optional.of(Short.parseShort(s, radix));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into an integer.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Integer>} represented by the string argument.
     * @see Integer#parseInt(String)
     */
    public static Optional<Integer> parseInteger(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into an integer.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @param radix the radix to be used while parsing
     * @return an {@link Optional<Integer>} represented by the string argument.
     * @see Integer#parseInt(String, int)
     */
    public static Optional<Integer> parseInteger(String s, int radix) {
        try {
            return Optional.of(Integer.parseInt(s, radix));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a long.
     * Any non-parseable value will result in {@link Optional#empty()}.
     * 
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Long>} represented by the string argument.
     * @see Long#parseLong(String)
     */
    public static Optional<Long> parseLong(String s) {
        try {
            return Optional.of(Long.parseLong(s));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a long.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @param radix the radix to be used while parsing
     * @return an {@link Optional<Long>} represented by the string argument.
     * @see Long#parseLong(String, int)
     */
    public static Optional<Long> parseLong(String s, int radix) {
        try {
            return Optional.of(Long.parseLong(s, radix));
        } catch (NumberFormatException ignored) {
            return Optional.empty();
        }
    }

    /**
     * Attempts to parse the string argument into a boolean.
     * Only the values {@code "true"} and {@code "false"} (case-insensitive) are mapped
     * to a {@link Boolean} value, otherwise the result is {@link Optional#empty()} (including for {@code null}).
     * <br>
     * This differs from {@link Boolean#parseBoolean(String)}
     * by separating a {@code false} return from an error ({@code Optional.empty()}).
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional} {@code boolean} represented by the string argument.
     */
    public static Optional<Boolean> parseBoolean(String s) {
        if (s == null) {
            return Optional.empty();
        }
        return switch(s.toLowerCase()) {
            case "true" -> Optional.of(Boolean.TRUE);
            case "false" -> Optional.of(Boolean.FALSE);
            default -> Optional.empty();
        };
    }

    /**
     * Attempts to parse the string argument into a boolean.
     * Only the values {@code "1"} and {@code "0"} (case-insensitive) are mapped
     * to {@code true} and {@code false} respectively.
     * Otherwise, the result is {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional} {@code boolean} represented by the string argument.
     */
    public static Optional<Boolean> parseBit(String s) {
        if (s == null) {
            return Optional.empty();
        }
        return switch(s.toLowerCase()) {
            case "true" -> Optional.of(Boolean.TRUE);
            case "false" -> Optional.of(Boolean.FALSE);
            default -> Optional.empty();
        };
    }

    /**
     * Attempts to parse the string argument into a float.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Short>} represented by the string argument.
     * @see Float#parseFloat(String) 
     */
    public static Optional<Float> parseFloat(String s) {
        try {
            return Optional.of(Float.parseFloat(s));
        } catch (Exception ignored) {
            return Optional.empty();
        }
    }
    
    /**
     * Attempts to parse the string argument into a double.
     * Any non-parseable value will result in {@link Optional#empty()}.
     *
     * @param s the {@code String} to be parsed.
     * @return an {@link Optional<Double>} represented by the string argument.
     * @see Double#parseDouble(String) 
     */
    public static Optional<Double> parseDouble(String s) {
        try {
            return Optional.of(Double.parseDouble(s));
        } catch (Exception ignored) {
            return Optional.empty();
        }
    }

}
