package com.sparta.mm.control_logic;

import com.sparta.mm.display.Choices;
import com.sparta.mm.sort_algorithms.binarytree.BinaryTree;
import com.sparta.mm.sort_algorithms.BubbleSort;

import static com.sparta.mm.control_logic.RandomArray.getArray;
import static com.sparta.mm.display.Choices.getBinaryChoice;
import static com.sparta.mm.display.DisplayManager.printUnsorted;
import static com.sparta.mm.sort_algorithms.binarytree.BinaryTree.myArray;

public class AlgorithmFactory {

    public static int getSortAlgorithm(int choice){

        switch(choice){
            case 1:
                getBinaryOption(getBinaryChoice());
                break;
            case 2:
                int[] newArray = getArray();
                printUnsorted(newArray);
                BubbleSort.getSortedArrayBubble(newArray);
                break;
        }   return 0;
    }

    public static void getBinaryOption(int choice){

        switch (choice){
            case 1:
                BinaryTree newTreeA = new BinaryTree();
                printUnsorted(myArray);
                newTreeA.getSortedTreeAsc();
                break;
            case 2:
                BinaryTree newTreeDesc = new BinaryTree();
                printUnsorted(myArray);
                newTreeDesc.getSortedTreeDesc();
                break;
        }
    }
}
