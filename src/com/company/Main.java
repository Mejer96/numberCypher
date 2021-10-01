package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean whileLoop = true;
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Please select your choice.");


        while (whileLoop) {
            System.out.println("Press '1' to encrypt.\nPress '2' to decrypt.\nPress '3' to exit.");

            System.out.print(">");
            String userInputFromMethod = MethodsMain.promptUserInput();
            // 1 for encoder.
            // 2 for decoder.
            // 3 for exit.
            if (userInputFromMethod.equals("1")) {
                char[] message = MethodsEncoder.messageToEncrypt();
                String encryptedMessage = MethodsEncoder.encryptMessage(message);

                if (encryptedMessage.contains("null")) {
                    System.out.println("Error. Only letters from the danish alphabet are valid. Try again.");
                } else {
                    System.out.println("The encrypted message is:");
                    System.out.println(encryptedMessage);

                    System.out.println("Would u like to decrypt your message? Press '1' for yes. '2' to go back to the menu.");
                    System.out.print(">");
                    userInput = scanner.nextLine();

                    if (userInput.equals("1")) {
                        int[] array = MethodsDecoder.turnEncodedMessageIntoArrayOfChars(encryptedMessage);
                        MethodsDecoder.decodeMessage(array);
                    }
                }
            } else if (userInputFromMethod.equals("3")) {
                whileLoop = false;
            } else {
                String messageToDecode = MethodsDecoder.userInputDecoder();
                int[] array = MethodsDecoder.turnEncodedMessageIntoArrayOfChars(messageToDecode);
                MethodsDecoder.decodeMessage(array);
            }

        }


    }
}
