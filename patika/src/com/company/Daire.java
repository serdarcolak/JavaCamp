package com.company;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
//        Dairenin Alanını ve Çevresini Hesaplayan Program
//        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
//
//                Alan Formülü : π * r * r;
//
//        Çevre Formülü : 2 * π * r;
//
//        Ödev
//        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
//
//        𝜋 sayısını = 3.14 alınız.
//
//                Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r, a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz : ");
        r = input.nextInt();
        System.out.print("Merkez Açısı Ölçüsü Giriniz : ");
        a = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlan = (pi * (r*r) * a) / 360;

        System.out.println("Alanı : " + alan);
        System.out.println("Çevresi : " + cevre);
        System.out.println("Daire Dilimi Alanı : " + dilimAlan);





    }
}
