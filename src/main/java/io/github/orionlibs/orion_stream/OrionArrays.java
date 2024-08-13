package io.github.orionlibs.orion_stream;

import io.github.orionlibs.orion_assert.Assert;
import java.util.stream.IntStream;

public class OrionArrays
{
    public static void setValue(int[] array, int value)
    {
        Assert.notEmpty(array, "The input array cannot be null or empty.");
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static void setValue(boolean[] array, boolean value)
    {
        Assert.notEmpty(array, "The input array cannot be null or empty.");
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static void fillArrayWithBooleanValue(boolean[] array, boolean value)
    {
        Assert.notEmpty(array, "The input array cannot be null or empty.");
        IntStream.range(0, array.length).forEach(i -> array[i] = value);
    }


    public static <T> Object[] getAsArrayOfObjects(T[] array)
    {
        Assert.notEmpty(array, "The input array cannot be null or empty.");
        Object[] newArray = new Object[array.length];
        IntStream.range(0, array.length).forEach(i -> newArray[i] = (Object)array[i]);
        return newArray;
    }
}