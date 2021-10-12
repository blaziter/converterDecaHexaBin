package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean next = true;
        do {
            System.out.println("Select mode:");
            System.out.println("DiB - Decadic into Binary");
            System.out.println("DiH - Decadic into Hexa");
            System.out.println("BiD - Binary into Decadic");
            System.out.println("BiH - Binary into Hexa");
            System.out.println("HiD - Hexa into Decadic");
            System.out.println("HiB - Heca into Binary");
            System.out.println("Enter a mode");
            String mode = scan.nextLine();
            System.out.println("Enter a number");
            String num = scan.nextLine();
            switch (mode) {
                case "DiB" -> System.out.println(Convertor.DiB(Integer.parseInt(num)));
                case "DiH" -> System.out.println(Convertor.DiH(Integer.parseInt(num)));
                case "BiD" -> System.out.println(Convertor.BiD(num));
                case "BiH" -> System.out.println(Convertor.BiH(num));
                case "HiD" -> System.out.println(Convertor.HiD(num));
                case "HiB" -> System.out.println(Convertor.HiB(num));
                default -> System.out.println("Unknown method");
            }

            System.out.println("Continue?");
            String agreement = scan.nextLine();
            switch (agreement) {
                case "Yes", "yes", "y" -> next = true;
                case "No", "no", "n" -> next = false;
                default -> System.out.println("Please enter yes or no.");
            }
        } while (next);
    }
}
