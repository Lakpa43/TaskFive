package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(swapCase(str));
    }

    public static String swapCase(String string) {
        char[] text = string.toCharArray();
        for (int i=0; i < text.length; i++) {
            char ch = text[i];
            if (Character.isUpperCase(ch)) {
                text[i] = Character.toLowerCase(ch);
            }else if (Character.isLowerCase(ch)) {
                text[i] = Character.toUpperCase(ch);
            }
        }
        return new String(text);
    }
}
