package com.company;

import java.util.Scanner;

public class MethodsEncoder {

    public static char[] messageToEncrypt() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the message you would like to encrypt.");
        System.out.print(">");

        String userInput = scanner.nextLine();
        String userInputNoSpaces = userInput.replace(" ", "");
        char[] arrayChars = new char[userInputNoSpaces.length()];

        userInputNoSpaces.getChars(0, userInputNoSpaces.length(), arrayChars, 0);

        return arrayChars;
    }

    public static String encryptMessage(char[] arrayFromMethod) {
        // method that will loop through the alphabet while comparing the chars from the parameter array
        // and then convert the chars to its respective number by adding 1 to i to compensate for
        // the index system.

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z', 'æ', 'ø', 'å'};
        String[] arrayEncryptedChars = new String[arrayFromMethod.length];
        String encryptedMessage = "";

        for (int index = 0; index < arrayFromMethod.length; index++)
            for (int i = 0; i < array.length; i++) {

                if (array[i] == arrayFromMethod[index]) {
                    int result = i + 1;
                    arrayEncryptedChars[index] = String.valueOf(result);

                    break;
                }
            }

        for (int i = 0; i < arrayEncryptedChars.length; i++) {
            encryptedMessage += arrayEncryptedChars[i] + ";";
        }

        return encryptedMessage.substring(0, encryptedMessage.length()-1);
    }
}
