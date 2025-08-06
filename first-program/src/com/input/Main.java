package com.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        System.out.println("The value of word: " + word);
        int number = input.nextInt();
        input.nextLine();
        System.out.println("The value of number: " + number);
        String line = input.nextLine();
        System.out.println("The value of line: " + line);
    }
}
