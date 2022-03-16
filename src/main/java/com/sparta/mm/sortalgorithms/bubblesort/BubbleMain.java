package com.sparta.mm.sortalgorithms.bubblesort;

import com.sparta.mm.display.MyArray;

import static com.sparta.mm.display.MyArray.newArray;

public class BubbleMain  {

    public static void main(String[] args){
        int[] randArr = MyArray.newArray;
        BubbleSort rearrangedArr = new BubbleSort();
        randArr = rearrangedArr.sortArr(randArr);
        rearrangedArr.printArr(randArr);
    }

}
