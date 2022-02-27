package com.company;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int s1, s2,secim;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        s2 = input.nextInt();

        System.out.print(" 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n");
        System.out.print("Seçimin : ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.print("Sonuc : " + (s1+s2));
                break;
            case 2:
                System.out.print("Sonuc : " + (s1-s2));
                break;
            case 3:
                System.out.print("Sonuc : " + (s1*s2));
                break;
            case 4:
                System.out.print("Sonuc : " + (s1/s2));
                break;
        }



    }
}
