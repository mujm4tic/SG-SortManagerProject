package com.sparta.mm.sortalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static int[] generateArray(){
        int[] randomArray = new int[2000];
        Random rand = new Random();
        for (int i=0; i<2000; i++){
            randomArray[i] = rand.nextInt(1000 - (-1000)) -1000;
        } return randomArray;
    }
}
