package com.sparta.mm.display;

import java.util.Scanner;

public class Choices {

    private static Scanner scanner = new Scanner(System.in);

    public static int getSorter() {
        System.out.println("Hello, please enter the number of your desired sorting algorithm type: " +
                "1-Binary or 2-Bubble");
        int choiceSorter = scanner.nextInt();
        if (choiceSorter > 3 || choiceSorter < 1) {
            System.out.println("Sorry, that's an invalid option, choose option '1' or '2'. ");
            getSorter();
        } return choiceSorter;
    }

    public static int getBinaryChoice(){
        System.out.println("Excellent, please enter the number of your desired array sorting type: " +
                "1-Ascending Order or 2-Descending Order");
        int choiceBinary = scanner.nextInt();
        if (choiceBinary > 2 || choiceBinary < 1) {
            System.out.println("Sorry, that's an invalid option, choose option '1' or '2'. ");
            getBinaryChoice();
        } return choiceBinary;
    }

    public static int getLengthArray(){
        System.out.println("Awesome, now choose how many numbers you want in your randomly generated " +
                "array up to 1000: " );
        int choiceLength = scanner.nextInt();
        if (choiceLength > 1000){
            System.out.println("Sorry, that's too big! Try again. ");
            getLengthArray();
        } if (choiceLength < 3){
            System.out.println("Sorry, you'll need between 3 and 1000 numbers to sort. ");
            getLengthArray();
        } return choiceLength;
    }

    public static int getRootNode(){
        System.out.println("Please select a root node as a starting point for your binary tree between " +
                "and inclusive of the values of 1000 and -1000: ");
        int choiceRootNode = scanner.nextInt();
        if(choiceRootNode > 1000){
            System.out.println("That number is too big! Choose one between 1000 and -1000. ");
            getRootNode();
        }
        if (choiceRootNode < -1000){
            System.out.println("That number is too small! Choose one between 1000 and -1000. ");
            getRootNode();
        } return choiceRootNode;
    }
}
