package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println(reversedString(string));
    }

    public static String reversedString(String string) {
        String str[] = string.split("\\s");
        String reversedString = "";
        for (String s : str) {
            StringBuilder stringBuilder = new StringBuilder(s);
            stringBuilder.reverse();
            reversedString += stringBuilder.toString() + " ";
        }
        return reversedString.trim();
    }
}
