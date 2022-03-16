package com.company;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int k,j;

        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        k = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        j = input.nextInt();
        int total = 1;
        for (int i = 1; i <= j; i++) {
            total *= k;
        }
        System.out.println("Result = " + total);


    }
}
