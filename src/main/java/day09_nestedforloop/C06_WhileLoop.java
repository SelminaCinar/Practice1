package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        *****INTERVİEW SORUSU ******
        Kullanıcıdan alınmak üzere sayilar isteyin.
        Sayi adedi 10'u gecerse yada toplami 500'ü gecerse bu kadar sayi yeter .... adet sayi girdiniz.
        Toplamı .... yazdirin.
         */


        Scanner input = new Scanner (System.in);

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (sayac<=10 && toplam<=500){
            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
            sayac++;
        }
        if(toplam>500){
            System.out.println(sayac + " adet sayi girdiniz. Toplamı : " +toplam );
        }else System.out.println("Bu kadar sayi yeter " + sayac + "  adet sayi girdiniz.Toplamı :"  +toplam);


























    }
}
