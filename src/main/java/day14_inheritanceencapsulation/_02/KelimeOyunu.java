package day14_inheritanceencapsulation._02;


import java.util.Scanner;

public class KelimeOyunu {

    static int oyuncu = 1;

    static int puan1  = 0;

    static int puan2 = 0;

    static String kelime = "";

    static String ekleme = "";

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(oyuncu + "Oyuncu bir kelime gir");
        kelime = input.next();//oyuncunun verdigi kelimeyi class levelda hiclik olarak atamistik

        oyuncuDegistir();//oyuncu degistirme methodu
        onaySor();



    }

    public static void onaySor() {
        System.out.println("Girilen kelime==> " + kelime);
        System.out.println(oyuncu + " girilen kelimeyi kabul ediiyor musunuz? \n 1:Evet   \n 0:Hayir" );

        int kabul = input.nextInt();
        if (kabul == 1) {//1 tercihi girilen kelimeyi kabul ettgini gosterir.

            if(oyuncu==1){//islemi yapan 1.oyuncu ise
                puan2+=kelime.length();
            }else
                puan1+=kelime.length();

            oyunaDevamEdecekMi();




        }else oyunuBitir();//girilen kelimeyi kabul etmiyor
    }

    public static void oyunaDevamEdecekMi() {
        System.out.println("Oyuna devam etmek istiyor musunuz ? \n 1:Evet \n 0:Hayir");
        int tercih =input.nextInt();

        if(tercih==1){
            kelimeEkle();
        }else {
            System.out.println("Oyun bitti");
            System.out.println("Selmina'nın puanı  = "+puan1);
            System.out.println("Emre'nin puanı = " + puan2);

            if(puan1>puan2){
                System.out.println("Kazanan Selmina");
            }else if(puan2>puan1){
                System.out.println("Kazanan Emre");
            }else{
                System.out.println("Oyun berabere");
            }
        }
    }

    public static void kelimeEkle() {
        System.out.println("Eski kelimeye eklenecek kelime giriniz");

        ekleme = input.next();
        System.out.println("Yeni kelimeyi basa mi sona mi ekleyelim ? \n 1:Basa ekle 0:Sona ekle");

        int tercih = input.nextInt();

        if(tercih==1){
            kelime=ekleme+kelime;

        }else kelime=kelime+ekleme;

        oyuncuDegistir();
        onaySor();

    }

    public static void oyunuBitir() {

        System.out.println("Oyunu "+ oyuncu + " .oyuncu kazandi");
    }


    public static void oyuncuDegistir() {

        if(oyuncu==1){//selmina
            oyuncu=2;//emre
        }else{
            oyuncu=1;
        }
    }

}
