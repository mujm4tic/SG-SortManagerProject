package com.sparta.mm.control_logic;

import com.sparta.mm.display.Choices;

import java.util.Random;

public class RandomArray {

    public static int[] getArray() {
        int lengthArray = Choices.getLengthArray();
        int[] randomArray = new int[lengthArray];
        Random rand = new Random();
        for (int i = 0; i < lengthArray; i++) {
            randomArray[i] = rand.nextInt(1001 - (-1000)) - 1000;
        }
        return randomArray;
    }//nextInt bound max exclusive, min inclusive
}



