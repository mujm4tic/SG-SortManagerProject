package com.sparta.mm.display;

import java.lang.reflect.Array;
import java.util.Arrays;
import com.sparta.mm.sort_algorithms.binarytree.BinaryTree;

public class DisplayManager {
    public static void printUnsorted(int[] array){
        System.out.println("My array is: " + Arrays.toString(array));
    }
    public static void printSortedAsc(int[] sortedArray){
        System.out.println("My new sorted array from smallest to biggest is: " + Arrays.toString(sortedArray));
    }
    public static void printSortedDesc(int[] sortedArray){
        System.out.println("My new sorted array from biggest to smallest is: " + Arrays.toString(sortedArray));
    }
}

