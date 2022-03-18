package com.sparta.mm.sortalgorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int[] generateArray(){
        int[] randomArray = new int[1000];
        Random rand = new Random();
        for (int i=0; i<1000; i++){
            randomArray[i] = rand.nextInt(1000 - (-1000)) -1000;
        } return randomArray;
    }


    //NEEDS EDITING
    // binary needs 2001 elements, then one selected as root, then generate same array without that value
    //to get to 2000 (happens in binary tree itself, or can happen here too)
    public static int[] generateArrayBinary(){
        int[] randomArray = new int[1000];
        Random rand = new Random();
        for (int i=0; i<1000; i++){
            randomArray[i] = rand.nextInt(1000 - (-1000)) -1000;
        } return randomArray;
    }
}
