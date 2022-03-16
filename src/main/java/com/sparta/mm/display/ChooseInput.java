package com.sparta.mm.display;

import java.util.Scanner;

public class ChooseInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int choose() {
        System.out.println("Please enter the number of your desired array sorting type: " +
                "1-Binary, 2-Bubble, or 3-Merge");
        int choice = scanner.nextInt();
        if (choice > 3 || choice < 1) {
            System.out.println("Sorry, invalid option");
            choose();
        } return choice;
    }
}
