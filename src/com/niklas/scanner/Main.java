package com.niklas.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Input Number!");
            int result = scan.nextInt();

            System.out.println("You picked: " + result);

        } while (true);


    }
}
