package com.company;

import java.util.Scanner;

public class MethodsDecoder {

    public static String userInputDecoder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the encoded message that you would like to decode.");
        System.out.print(">");

        return scanner.nextLine();

    }

    public static int[] turnEncodedMessageIntoArrayOfChars(String encodedMessage) {
        // splits the encodedMessage into an array and then casts the array's elements into integers for later use.
        String[] array = encodedMessage.split(";");
        int[] arrayOfIntegers = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayOfIntegers[i] = Integer.parseInt(array[i]);
        }

        return arrayOfIntegers;
    }

    public static void decodeMessage(int[] arrayFromMethod) {
        // decodes message by looping through array and comparing i + 1 (compensate for index system) with the integers in arrayFromMethod.
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "y", "z", "æ", "ø", "å"};
        String[] decodedNumbers = new String[arrayFromMethod.length];
        String decodedMessage = "";

        for (int index = 0; index < arrayFromMethod.length; index++) {

            for (int i = 0; i < array.length; i++) {
                if (i + 1 == arrayFromMethod[index]) {
                    decodedNumbers[index] = array[i];
                }
            }
        }

        for (int i = 0; i < decodedNumbers.length; i++ ) {
            decodedMessage += decodedNumbers[i];
        }
        System.out.println("Your decoded message is:");
        System.out.println(decodedMessage);
    }

}
