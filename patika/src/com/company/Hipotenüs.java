package com.company;
import java.util.Scanner;

public class Hipotenüs {

    public static void main(String[] args) {

//        Dik Üçgende Hipotenüs Bulan Program
//        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
//
//        Ödev
//        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//        Formül
//        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//                𝑢 = (a+b+c) / 2
//
//        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        System.out.print("A Kenar Uzunluğunu Giriniz: ");
        a = input.nextInt();
        System.out.print("B Kenar Uzunluğunu Giriniz: ");
        b = input.nextInt();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print(c);


    }
}