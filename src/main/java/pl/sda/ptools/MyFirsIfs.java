package pl.sda.ptools;

import java.util.Scanner;

public class MyFirsIfs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you a: ");
        int a = scanner.nextInt();
        System.out.println("Please enter you b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.print("a is larger b ");
        }
        if (a < b) {
            System.out.print("b is larger than a");
        }
        if (a == b) {
            System.out.println("a and b are equals");
        }
    }
}