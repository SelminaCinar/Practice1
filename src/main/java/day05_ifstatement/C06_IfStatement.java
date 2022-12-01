package day05_ifstatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

        //  Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner (System.in);
        System.out.println("Dort basamakli bir sayi giriniz..");

        int sayi = input.nextInt();

        if(sayi<=1000 || sayi>=9999){//istenmeyen durum incelenmeli
            System.out.println("Lutfen dort basamakli bir sayi giriniz  ");
        }else if(sayi%5==0){//4 basamaklı ve 5 e tam bölünüyor
            if (sayi % 10 == 0) {//4 basamakli 5 ile bolunebilen son rakam=0
                System.out.println("5'e bölünebilen cift sayi");
            }else {
                System.out.println("5'e bölünebilen tek sayi");
            }
        }else {
            System.out.println("Tekrar deneyin");
        }






















    }
}
