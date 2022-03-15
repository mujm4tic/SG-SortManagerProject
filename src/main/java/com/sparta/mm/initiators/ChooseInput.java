package com.sparta.mm.initiators;

import java.util.Scanner;

public class ChooseInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int choose() {
        System.out.println("Please enter the number of your desired array sorting type: " +
                "1-Bubble, 2-Binary, or 3-Merge");
        int choice = scanner.nextInt();
        if (choice > 3 || choice < 1) {
            System.out.println("Sorry, invalid option");
            choose();
        } return choice;
    }
}
