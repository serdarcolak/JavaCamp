package com.company;
import java.util.Scanner;

public class Kdv {

    public static void main(String[] args) {

//        KDV Tutarı Hesaplayan Program
//        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//        (Not : KDV tutarını 18% olarak alın)
//
//        KDV'siz Fiyat = 10;
//
//        KDV'li Fiyat = 11.8;
//
//        KDV tutarı = 1.8;
//
//        Ödev
//        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazını

        double price;
        double kdv1 = 0.18;
        double kdv2 = 0.08;


        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");
        price = input.nextInt();

        if (price <= 1000) {
            double kdvTutarı = price * kdv1;
            double kdvliTutarı = price + kdvTutarı;
            System.out.println("Kdv'li Tutarı : " + kdvliTutarı);
            System.out.println("Kdv Tutarı : " + kdvTutarı);
            System.out.println("0.18 çalıştı");
        }
        else {
            double kdvTutarı2 = price * kdv2;
            double kdvliTutarı = price + kdvTutarı2;
            System.out.println("Kdv'li Tutarı : " + kdvliTutarı);
            System.out.println("Kdv Tutarı : " + kdvTutarı2);
            System.out.println("0.08 çalıştı");

        }

    }
}