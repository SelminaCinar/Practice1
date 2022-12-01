package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        //BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;

        Scanner input = new Scanner(System.in);
        System.out.println("Pazartesi : 1 \t Sali : 2 \t Carsamba : 3 \t Persembe :4 ?\t Cuma : 5 \t Cumartesi : 6 \t Pazar : 7 \n" +
                "Haftanin kacinci gununde oldugunuzu giriniz");

        int kacinciGun = input.nextInt();

        if (kacinciGun <= 0 || kacinciGun >=7) {
            System.out.println("Hatali veri girdiniz");
        } else {

            System.out.println("Kac gun sonrasini bilmek istiyorsunuz");
            int kacGunSonrasi = input.nextInt();
            int bulunanGun = (kacGunSonrasi + kacinciGun) % 7;

            switch (bulunanGun) {
                case 1:
                    System.out.println(kacGunSonrasi + " gun sonra Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi + " gun sonra Sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi + " gun sonra Carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi + " gun sonra Persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi + " gun sonra Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi + " gun sonra Cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi + " gun sonra Pazar");
                    break;
                default:
                    System.out.println("Gecerli bir deger giriniz");
            }


        }


    }
}
