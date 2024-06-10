package com.madimadica.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Iterator;

public abstract class CollectionParser {

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Bytes.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Byte>>} containing the parsed values.
     * @see StringParser#parseByte(String)
     */
    public static Optional<List<Byte>> parseBytes(Collection<String> strings) {
        List<Byte> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Byte> parsedValue = StringParser.parseByte(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Shorts.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Short>>} containing the parsed values.
     * @see StringParser#parseShort(String)
     */
    public static Optional<List<Short>> parseShorts(Collection<String> strings) {
        List<Short> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Short> parsedValue = StringParser.parseShort(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Integers.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Integer>>} containing the parsed values.
     * @see StringParser#parseInteger(String)
     */
    public static Optional<List<Integer>> parseIntegers(Collection<String> strings) {
        List<Integer> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Integer> parsedValue = StringParser.parseInteger(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Longs.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Long>>} containing the parsed values.
     * @see StringParser#parseLong(String)
     */
    public static Optional<List<Long>> parseLongs(Collection<String> strings) {
        List<Long> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Long> parsedValue = StringParser.parseLong(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Floats.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Float>>} containing the parsed values.
     * @see StringParser#parseFloat(String)
     */
    public static Optional<List<Float>> parseFloats(Collection<String> strings) {
        List<Float> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Float> parsedValue = StringParser.parseFloat(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

    /**
     * Attempts to parse each element in the argument {@code Collection} into a list of Doubles.
     * If any element fails to parse, an {@link Optional#empty()} is returned.
     * Otherwise, a list of successfully parsed values is returned.<br>
     * The return order is the same as the {@link Iterator} for the {@link Collection} argument.
     *
     * @param strings the {@link Collection} of strings to be parsed.
     * @return an {@code Optional<List<Double>>} containing the parsed values.
     * @see StringParser#parseDouble(String)
     */
    public static Optional<List<Double>> parseDoubles(Collection<String> strings) {
        List<Double> results = new ArrayList<>(strings.size());
        for (String s : strings) {
            Optional<Double> parsedValue = StringParser.parseDouble(s);
            if (parsedValue.isEmpty()) {
                return Optional.empty();
            } else {
                results.add(parsedValue.get());
            }
        }
        return Optional.of(results);
    }

}
