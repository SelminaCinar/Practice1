package day06_nestedifswitch;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
/*
        DERS PROGRAMI

        Hangi gun hangi dersin oldugunu gosteren bir program yaz
         Pazartesi ve Sali ise: Java
        Persembe ve Cuma ise: Selenyum
        Carsamba ve Cumartesi ise: SQL
       aksi halde: izin gunu=Day Off

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gun = input.next().toUpperCase();

        switch(gun){
            case "PAZARTESI" :
            case "SALI" :
                System.out.println("JAVA");
                break;
            case "PERSEMBE" :
            case "CUMA" :
                System.out.println("SELENYUM");
                break;
            case "CARSAMBA":
            case "CUMARTESİ":
                System.out.println("SQL");
                break;
            default :
                System.out.println("DAY OFF");
        }

    }
}
