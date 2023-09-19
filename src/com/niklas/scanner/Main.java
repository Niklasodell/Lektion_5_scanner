package com.niklas.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Denna aktiverar subklassen //

        do {
            System.out.println("Did this rune once?");
        }while (false);

    }

    public static void scanner() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert some sentence");
        scan.nextLine();
    }
}
