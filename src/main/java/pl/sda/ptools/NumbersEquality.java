package pl.sda.ptools;

import java.util.Scanner;

public class NumbersEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter you b: ");
        int b = scanner.nextInt();

        if (a > b) {
            printMessageWithNewLine("a is greater than b");
        }
        if (a < b) {
            printMessageWithNewLine("b is larger than a");
        }
        if (a == b) {
            printMessageWithNewLine("a and b are equals");
        }
    }

    private static void printMessageWithNewLine(String message) {
        System.out.println(message);
    }
}
