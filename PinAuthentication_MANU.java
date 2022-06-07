/*
Ask user to input 5 digit pin -DONE
Provide user with values - DONE
Ask User to input encrypted pin;
 */

import java.util.Arrays;
import java.util.Scanner;

public class PinAuthentication {
    private static final int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] randomizedValues = new int[10];
    static int[] pin = new int[5];
    static int[] userInput = new int[5];
    static int[] encryptedInput = new int[5];

    // first create array of length 10 [0-9]
    // randomize each element in array from 1-3.
    public PinAuthentication() {
    }

    public static int[] randomizeValues(int[] values) {
        for (int i = 0; i < values.length; i++) {
            randomizedValues[i] = (int) Math.ceil(3 * Math.random());
        }
        return randomizedValues;
    }

    // create user pin
    public static void userPin() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input 5 digit pin:\n");
        String tempPin = keyboard.nextLine();
        if (tempPin.length() == 5) {
            //create new is valid digit function
            for (int i = 0; i < tempPin.length(); i++) {
                char c = tempPin.charAt(i);
                if (Character.isDigit(c)) {
                    pin[i] = Character.getNumericValue(c);
                } else {
                    System.out.println("Not a valid input");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Input is not 5 digits");
            System.exit(0);
        }
    }

    // below is for user attempts to log in after being presented with randomized array of digits.
    public static void userLogin() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input encrypted 5 digit pin:\n");
        String tempPin = keyboard.nextLine();
        if (tempPin.length() == 5) {
            //create new is valid digit function
            for (int i = 0; i < tempPin.length(); i++) {
                char c = tempPin.charAt(i);
            }
            for (int i = 0; i < userInput.length; i++) {
                char c = tempPin.charAt(i);
                if (Character.isDigit(c) && Character.getNumericValue(c) <= 3 && Character.getNumericValue(c) > 0) {
                    encryptedInput[i] = Character.getNumericValue(c);
                } else {
                    System.out.println("Not a valid input");
                    System.exit(0);
                }
            }
        }
    }

    // below will be used to authenticate userLogin input
    public static boolean authenticate() {
        boolean authenticationStatus = false;
        for (int i = 0; i < encryptedInput.length; i++) {
            if (encryptedInput[i] == randomizedValues[pin[i] - 1]) {
                authenticationStatus = true;
            } else {
                authenticationStatus = false;
            }
        }
        if(authenticationStatus == true){
            System.out.println("Success");
        }
        else{
            System.out.println("Incorrect Password");
        }
        return authenticationStatus;
    }

    public static void main(String[] args) {
        userPin();
        System.out.println(Arrays.toString(values));
        System.out.println("Please input the corresponding (1-3) digits for your pin" +  Arrays.toString(randomizeValues(values)));
        userLogin();
        authenticate();



    }
}




