package com.sparta.mm.sort_algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sortArr(int[] localArr){
        boolean notSorted = true;
        int first;
        int second;
        int temp;
        while (notSorted){
            notSorted = false;
            for (int i = 0; i < localArr.length-1; i++){
                first = localArr[i];
                second = localArr[i+1];
                if(first > second){
                    temp = second;
                    second = first;
                    first = temp;
                    localArr[i] = first;
                    localArr[i+1] = second;
                    notSorted = true;
                }
            }
        } return localArr;
    }

    public void printArr (int[] newArr){
        System.out.println(Arrays.toString(newArr));
    }
}
