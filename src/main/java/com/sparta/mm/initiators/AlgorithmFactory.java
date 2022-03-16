package com.sparta.mm.initiators;

import com.sparta.mm.sortalgorithms.bubblesort.BubbleMain;
import com.sparta.mm.sortalgorithms.bubblesort.BubbleSort;
import com.sparta.mm.sortalgorithms.binarytree.BinaryMain;

public class AlgorithmFactory {

    public static int getSortAlgorithm(int choice){

        switch(choice){

            case 1:
                BinaryMain();
                break;
            case 2:
                BubbleMain();
                break;
            case 3:
                // Merge array once ready
                break;
        }   return 0;


    }
//
//    //plug in array - conversion must happen in separate class in mosel (sort algorithms),
//    // must break down the values into int, or fed through via for loop calling method
//    // with rootnode

    // or just send to the BubbleSortMain class' main to handle it all

}
