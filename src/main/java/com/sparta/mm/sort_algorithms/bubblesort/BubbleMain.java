package com.sparta.mm.sort_algorithms.bubblesort;

import com.sparta.mm.display.DisplayManager;

public class BubbleMain  {

    public static void main(String[] args){
        int[] randArr = DisplayManager.newArray;
        BubbleSort rearrangedArr = new BubbleSort();
        randArr = rearrangedArr.sortArr(randArr);
        rearrangedArr.printArr(randArr);
    }

}
