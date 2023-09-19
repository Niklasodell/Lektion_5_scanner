package com.niklas.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Denna aktiverar subklassen //

        boolean isPlaying = true;

        do {
            int result = scannerNumber();

            if (result > 1000) {
                isPlaying = false;
                break;
            }

                for (int i = 0; i < result; i++) {
                    System.out.println(i);
                    System.out.println("Looping...");
                }


        }while (isPlaying);

    }


    public static int scannerNumber() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert a number");
        return scan.nextInt();
    }


    public static String scannerText() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = scan.nextLine();

        return input;
    }
}
