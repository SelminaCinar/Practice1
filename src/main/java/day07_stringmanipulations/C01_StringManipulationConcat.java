package day07_stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulationConcat {
    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba"); //35Merhaba
        System.out.println("Merhaba" + 15 + 20); // Merhaba1520
        System.out.println("Merhaba" + (15 + 20));//Merhaba35
        System.out.println("Merhaba" + 15 * 20);//Merhaba300

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //tam isminin buyuk harfle yazilmasini saglayin.



        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz.");
        String isim = input.nextLine();
        String soyisim = input.nextLine();

        System.out.println("Kullanıcının ismi =  " + isim + " " + soyisim);
























    }
}
