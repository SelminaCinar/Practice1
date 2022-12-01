package day04_ifstatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        //Stringlerde == kullanilmaz.Onun yerine equals kullaniriz.Cunku Javada 2 tane memory var.
        // Stringde referans değerine bakildiği icin equals kullanilir.

        System.out.println("Lutfen gun ismi giriniz");
        String gun = input.next();

        //1.Yol
        if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else {
            System.out.println("gecerli bir gun giriniz");
        }
        //2.Yol
        String gun1 = input.next().toLowerCase();

        if(gun1.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }else if (gun1.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }else if(gun1.equals("pazar")){
            System.out.println("Hiristiyanlar icin kutsal gun");
        }else
            System.out.println("Kutsal gun degil");
























    }
}
