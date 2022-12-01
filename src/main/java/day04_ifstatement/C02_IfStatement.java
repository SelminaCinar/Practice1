package day04_ifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

          /*
    Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
                 not hesaplayici
              90 ~100 => A  Cok Iyi
              80 ~ 89 => B  Iyi
              70 ~ 79 => C  Orta
              60 ~ 69 => D  Gecer
              0 ~ 59  => F  Zayif
   */
        Scanner input = new Scanner (System.in);
        System.out.println("Bir sayi giriniz");

        byte not = input.nextByte();

        if(not>=90 && not<=100){
            System.out.println("A Cok iyi");
        }else if(not <90 && not>=80){
            System.out.println("B Iyi");
        }else if (not<80 && not >=70){
            System.out.println("C Orta");
        }else if(not<70 && not >=60){
            System.out.println("D Geçer");
        }else if(not<60 && not >=0){
            System.out.println("F Zayif");
        }else {
            System.out.println("Gecerli bir not giriniz");
        }

















    }
}
