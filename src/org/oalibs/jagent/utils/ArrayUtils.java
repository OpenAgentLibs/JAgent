package org.oalibs.jagent.utils;

import java.lang.reflect.Array;

/**
 * User: Matt Balmer
 * Date: 8/8/13
 * Time: 11:47 PM
 */
public class ArrayUtils {

    /**
     * Converts an array to a String, inserting a line break between elements
     * @param array array to convert
     * @param <T> Class of Objects that the array houses
     * @return human-readable toString
     */
    public static <T> String arrayToString(T[] array) {
        if(array == null) return "Array is null.";
        String result = "";
        for(T item : array)
            result += item.toString()+"\n";
        return result;
    }

    /**
     * Creates an array, of length 1, with the given object as the single element
     * @param cls Class to instantiate the array with
     * @param item Object to fill the array with
     * @param <T> Class to bind the array to
     * @return the array
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] makeArray(Class<T> cls, T item) {
        T[] array = (T[]) Array.newInstance(cls, 1);
        array[0] = item;
        return array;
    }

}