package com.sparta.mm.sort_algorithms;

import static com.sparta.mm.display.DisplayManager.printSortedAsc;
import static com.sparta.mm.display.DisplayManager.printTimeTaken;

public class BubbleSort {
    public static int[] getSortedArrayBubble(int[] newArray){
        long start = System.nanoTime();
        boolean notSorted = true;
        int first;
        int second;
        int temp;
        while (notSorted){
            notSorted = false;
            for (int i = 0; i < newArray.length-1; i++){
                first = newArray[i];
                second = newArray[i+1];
                if(first > second){
                    temp = second;
                    second = first;
                    first = temp;
                    newArray[i] = first;
                    newArray[i+1] = second;
                    notSorted = true;
                }
            }
        }  printSortedAsc(newArray);
        long end = System.nanoTime();
        printTimeTaken(start, end);
        return newArray;
    }
}
