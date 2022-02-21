package com.company;

import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Girin : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Girin : ");
        kilo = input.nextDouble();

        double hesaplama = kilo / (boy * boy);

        System.out.println("Sonuc = " + hesaplama);
    }

}
