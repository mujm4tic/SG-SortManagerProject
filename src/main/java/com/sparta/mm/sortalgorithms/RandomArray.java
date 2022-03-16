package com.sparta.mm.sortalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    private static int[] generateArray(){
        int[] randomArray = new int[2000];
        Random rand = new Random();
        for (int i=0; i<2000; i++){
            randomArray[i] = rand.nextInt(1000 - (-1000)) -1000;
        } return randomArray;
    }

    // get rid of this main eventually, one main only
    public static void main(String[] args) {
        int[] newArray = generateArray();
        System.out.println(Arrays.toString(newArray));
        System.out.println("My array length is: " + Array.getLength(newArray));
    }
}
