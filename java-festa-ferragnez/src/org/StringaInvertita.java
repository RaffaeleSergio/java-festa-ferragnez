package org;

import java.util.Scanner;

public class StringaInvertita { public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        String invertita = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            invertita += input.charAt(i);
        }

        System.out.println("Stringa invertita: " + invertita);

        scanner.close();
    }
}