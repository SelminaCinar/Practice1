package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle = "Bugun hava yagmurlu";

        System.out.println(cumle.length());//19

        String str = "";
        System.out.println(str.length());//0

        String str1 = " ";
        System.out.println(str1.length());//1

        Scanner input = new Scanner(System.in);
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        System.out.println("İsim ve soyisminizi giriniz");
        String isim = input.nextLine();
        String soyIsim = input.nextLine();

        if (isim.length() > soyIsim.length()) {
            System.out.println("İsminiz daha uzun");
        } else if (soyIsim.length() > isim.length()) {
            System.out.println("Soyisminiz daha uzun");
        } else if (isim.length() == soyIsim.length()) {
            System.out.println("Isminiz ve soyisminiz eşittir");
        } else {
            System.out.println("Gecerli bir deger giriniz");
        }


        //Kullanıcıdan 4 harfli bir kelime isteyin
        //ve girilen kelimeyi tersten yazdirin.

        System.out.println("4 harfli bir kelime giriniz");
        String kelime = input.next();
        System.out.println(kelime.length());

        if (kelime.length() == 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);

            System.out.println("Tersten yazılmış hali : " + dort + uc + iki + bir);
        } else if (kelime.length() > 4) {
            System.out.println("4 karakterden fazla girdiniz");
        } else if (kelime.length() < 4) {
            System.out.println("4 karakterden az girdiniz");
        }


    }
}
