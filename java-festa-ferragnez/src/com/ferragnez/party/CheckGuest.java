package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
public static void main(String[] args) {
    String[] guestList = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax",
            "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis",
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Come ti chiami? ");
        String userName = scanner.nextLine();

        boolean found = false;

        // Versione con il ciclo for
        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equalsIgnoreCase(userName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Benvenuto alla festa!");
        } else {
            System.out.println("Mi dispiace, non sei sulla lista.");
        }

        scanner.close();
    }
}


// Versione con il ciclo while
// int i = 0;
// while (i < guestList.length) {
//     if (guestList[i].equalsIgnoreCase(userName)) {
//         found = true;
//         break;
//     }
//     i++;
// }

