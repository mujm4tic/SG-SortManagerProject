package com.sparta.mm.control_logic;

import com.sparta.mm.display.Choices;
import com.sparta.mm.sort_algorithms.binarytree.BinaryTree;

import static com.sparta.mm.control_logic.RandomArray.getArray;
import static com.sparta.mm.display.Choices.getBinaryChoice;

public class AlgorithmFactory {

    public static int getSortAlgorithm(int choice){

        switch(choice){
            case 1:
                getBinaryOption(getBinaryChoice());
                break;
            case 2:
                int[] newArray = getArray();
                break;
        }   return Choices.getSorter();
    }


    public static int getBinaryOption(int choice){

        switch (choice){
            case 1:
                BinaryTree newTreeAsc = new BinaryTree();
                newTreeAsc.getSortedTreeAsc();
                break;
            case 2:
                BinaryTree newTreeDesc = new BinaryTree();
                newTreeDesc.getSortedTreeDesc();
                break;
        } return 0;
    }
}
