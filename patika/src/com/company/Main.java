    package com.company;
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
            //
            //Ödev
            //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
            //
            //Not : If ve Else kullanılmayacak...

            Scanner input = new Scanner(System.in);

            int matematik, fizik, kimya, turkce, tarih,muzik;

            System.out.print("Matematik Notunuzu Giriniz : ");
            matematik = input.nextInt();
            System.out.print("Fizik Notunuzu Giriniz : ");
            fizik = input.nextInt();
            System.out.print("Kimya Notunuzu Giriniz : ");
            kimya = input.nextInt();
            System.out.print("Turkce Notunuzu Giriniz : ");
            turkce = input.nextInt();
            System.out.print("Tarih Notunuzu Giriniz : ");
            tarih = input.nextInt();
            System.out.print("Muzik Notunuzu Giriniz : ");
            muzik = input.nextInt();


            int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
            double sonuc = toplam / 6.0;

            String dersDurum = sonuc > 60 ? "Geçti" : "Kaldı";

            System.out.println(dersDurum);

        }
    }
