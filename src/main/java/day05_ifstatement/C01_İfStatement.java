package day05_ifstatement;

import java.util.Scanner;

public class C01_İfStatement {

    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("İkinci sayiyi giriniz");
        double sayi2= input.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("Sayilarin toplami =  " + (sayi1 + sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("Sayilarin carpimi = " + (sayi1*sayi2));
        }else if (sayi1*sayi2<0){//sayi1>0 && sayi2>0 || sayi1<0 && sayi2<0
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsın");

        }else System.out.println("Sifir carpmaya göre yutan elemandir..");












    }

















}
