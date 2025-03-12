package Zadatak2;

import java.util.Scanner;

public class Zad2Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upisi broj redaka: ");
        int x = scan.nextInt();
        System.out.println("Upisi broj stupaca: ");
        int y = scan.nextInt();

        iscrtaj(x, y);
    }

    private static void iscrtaj(int x, int y) {
        for (int r = 1; r <= x; r++) {
            for (int s = 0; s < y; s++) {
                if (r % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print("°");
                }
            }
            System.out.println();
        }
    }
}
