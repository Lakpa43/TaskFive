package com.Lakpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string to check isogram: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        System.out.println(isIsogram(userString));
    }

    public static boolean isIsogram(String string) {

        string = string.toLowerCase();
        int len = string.length();

        char arr[] = string.toCharArray();

        Arrays.sort(arr);
        for (int i=0; i < len -1; i++) {
            if (arr[i] == arr[i+1])
                return false;
        }
        return true;
    }
}
