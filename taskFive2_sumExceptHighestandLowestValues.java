package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;
        int[] userNumber;
        System.out.println("How many numbers in input: ");
        userInput = scanner.nextInt();
        userNumber = new int[userInput];

        for (int i=0; i < userNumber.length; i++) {
            System.out.println("Enter a number: ");
            userNumber[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < userNumber.length; i++) {
            sum = sum + userNumber[i];
        }
        int minValue = userNumber[0];
        for (int i=1; i < userNumber.length; i++) {
            if (userNumber[i] < minValue) {
                minValue = userNumber[i];
            }
        }
        int maxValue = userNumber[0];
        for (int i=1; i < userNumber.length; i++) {
            if (userNumber[i] > maxValue) {
                maxValue = userNumber[i];
            }
        }
        int result = sum - (minValue+maxValue);
        System.out.println("Sum of the values except highest and lowest values is " + result + ".");
    }
}
