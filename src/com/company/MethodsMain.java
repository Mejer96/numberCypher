package com.company;

import java.util.Scanner;

public class MethodsMain {

    public static String promptUserInput() {
        boolean whileLoop = true;
        Scanner scanner = new Scanner(System.in);
        String userInput = null;


        while (whileLoop) {

            userInput = scanner.nextLine();

            if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3") ) {
                whileLoop = false;
            } else {
                System.out.println("Error. Please type '1', '2' or '3'.");
            }
        }
        return userInput;
    }

}
