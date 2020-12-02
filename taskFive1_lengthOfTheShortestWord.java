package com.Lakpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the text string:");
        Scanner scanner = new Scanner(System.in);
        String userText = scanner.nextLine();
        String userWord[] = userText.split(" ");
        int shortestWordLength = userWord[0].length();
        String shortestWord = " ";

        for (int i=0; i<userWord.length; i++) {
            if (userWord[i].length() < shortestWordLength) {
                shortestWordLength = userWord[i].length();
                shortestWord = userWord[i];
            }
        }
        System.out.println("Shortest word = " + shortestWord);
        System.out.println("Length = " + shortestWordLength);
    }
}
