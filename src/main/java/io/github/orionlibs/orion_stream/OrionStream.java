package io.github.orionlibs.orion_stream;

import io.github.orionlibs.orion_assert.Assert;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OrionStream
{
    public static <T> Stream<T> filter(Stream<T> stream, Predicate<T> filterToApply)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return stream.filter(filterToApply);
    }


    public static <T> Stream<T> filter(T[] array, Predicate<T> filterToApply)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return Arrays.stream(array).filter(filterToApply);
    }


    public static <T> Stream<T> filter(Collection<T> elements, Predicate<T> filterToApply)
    {
        Assert.notEmpty(elements, "The input elements collection cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return elements.stream().filter(filterToApply);
    }


    public static <T> void forAllIndices(T[] array, IntConsumer action)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        IntStream.range(0, array.length).forEach(action);
    }


    public static <T> void forAllIndices(List<T> elements, IntConsumer action)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        IntStream.range(0, elements.size()).forEach(action);
    }


    public static <T> boolean findAny(T[] array, Predicate<T> filterToApply)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return Arrays.stream(array).anyMatch(filterToApply);
    }


    public static <T> boolean findAny(Collection<T> elements, Predicate<T> filterToApply)
    {
        Assert.notEmpty(elements, "The input elements collection cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return elements.stream().anyMatch(filterToApply);
    }


    public static <T> boolean findAny(T[] array, IntPredicate filterToApply)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return IntStream.range(0, array.length).anyMatch(filterToApply);
    }


    public static <T> boolean findAny(List<T> elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return IntStream.range(0, elements.size()).anyMatch(filterToApply);
    }


    public static <T> boolean findNone(T[] array, Predicate<T> filterToApply)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return Arrays.stream(array).noneMatch(filterToApply);
    }


    public static <T> boolean findNone(Collection<T> elements, Predicate<T> filterToApply)
    {
        Assert.notEmpty(elements, "The input elements collection cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return elements.stream().noneMatch(filterToApply);
    }


    public static <T> boolean findNone(T[] array, IntPredicate filterToApply)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return IntStream.range(0, array.length).noneMatch(filterToApply);
    }


    public static <T> boolean findNone(List<T> elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return IntStream.range(0, elements.size()).noneMatch(filterToApply);
    }


    public static <T> T findFirst(List<T> elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        for(int i = 0; i < elements.size(); i++)
        {
            if(filterToApply.test(i))
            {
                return elements.get(i);
            }
        }
        return null;
    }


    public static <T> int findFirstIndex(List<T> elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        for(int i = 0; i < elements.size(); i++)
        {
            if(filterToApply.test(i))
            {
                return i;
            }
        }
        return -1;
    }


    public static <T> T findFirst(T[] elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return findFirst(Arrays.asList(elements), filterToApply);
    }


    public static <T> int findFirstIndex(T[] elements, IntPredicate filterToApply)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        return findFirstIndex(Arrays.asList(elements), filterToApply);
    }


    public static <T> void forAll(T[] array, Consumer<T> action)
    {
        Assert.notEmpty(array, "The input array cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        Arrays.stream(array).forEach(action);
    }


    public static <T> void forAll(Collection<T> elements, Consumer<T> action)
    {
        Assert.notEmpty(elements, "The input elements collection cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        elements.stream().forEach(action);
    }


    public static <T> void forAll(Stream<T> stream, Consumer<T> action)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        stream.forEach(action);
    }


    public static <T> void forAll(IntStream stream, IntConsumer action)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        stream.forEach(action);
    }


    public static <T> void filterAndLoop(T[] array, Predicate<T> filterToApply, Consumer<T> action)
    {
        Assert.notEmpty(array, "The input array cannot be null/empty.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        forAll(filter(array, filterToApply), action);
    }


    public static <T> void filterAndLoop(Collection<T> elements, Predicate<T> filterToApply, Consumer<T> action)
    {
        Assert.notEmpty(elements, "The input elements collection cannot be null/empty.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        forAll(filter(elements, filterToApply), action);
    }


    public static <T> void filterAndLoop(T[] array, IntPredicate filterToApply, IntConsumer action)
    {
        Assert.notEmpty(array, "The input array cannot be null/empty.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        forAll(IntStream.range(0, array.length).filter(filterToApply), action);
    }


    public static <T> void filterAndLoop(List<T> elements, IntPredicate filterToApply, IntConsumer action)
    {
        Assert.notEmpty(elements, "The input elements list cannot be null/empty.");
        Assert.notNull(filterToApply, "The input filterToApply cannot be null.");
        Assert.notNull(action, "The input action cannot be null.");
        forAll(IntStream.range(0, elements.size()).filter(filterToApply), action);
    }


    public static <T> List<T> getAsList(Stream<T> stream)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        return stream.collect(Collectors.toList());
    }


    public static <T> Set<T> getAsSet(Stream<T> stream)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        return stream.collect(Collectors.toSet());
    }


    @SuppressWarnings("unchecked")
    public static <T> T[] getAsArray(Stream<T> stream, Class<T> classToCastElementsTo)
    {
        Assert.notNull(stream, "The input stream cannot be null.");
        Assert.notNull(classToCastElementsTo, "The input classToCastElementsTo cannot be null.");
        List<T> list = getAsList(stream);
        T[] array = (T[])Array.newInstance(classToCastElementsTo, list.size());
        IntStream.range(0, list.size()).forEach(i -> array[i] = list.get(i));
        return array;
    }
}