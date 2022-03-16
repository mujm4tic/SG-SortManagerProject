package com.sparta.mm.display;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.sparta.mm.sortalgorithms.RandomArray.generateArray;

public class MyArray {

    static final public int[] newArray = generateArray();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(newArray));
        System.out.println("My array length is: " + Array.getLength(newArray));
    }
}
