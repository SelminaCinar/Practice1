package day14_inheritanceencapsulation._02;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner {

    static List<String> listKullaniciId = new ArrayList<>();
    static List<Integer> listKullaniciSaniye = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    static int counter = 0;


    public void kayit() {

        String kullaniciId = "";
        System.out.println("Lutfen kullanici ID giriniz");
        kullaniciId = input.nextLine();

        int kullaniciSaniye = LocalDateTime.now().getSecond();//0 ile 60 saniye arasinda bir deger verir.
        System.out.println("Kullanici saniye " + kullaniciSaniye);

        listKullaniciId.add(kullaniciId);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevammi();

    }


    private void tamamMiDevammi() {
        String tmmMDvmmM = "";

        do {

            System.out.println("Baska kayit var mi (E/H) ");
            tmmMDvmmM = input.next();

            if (tmmMDvmmM.equalsIgnoreCase("e")) {
                kayit();

            } else if (tmmMDvmmM.equalsIgnoreCase("h")) {
                System.out.println("Gule gule");
                break;
            }

        } while (!tmmMDvmmM.equalsIgnoreCase("e") && !tmmMDvmmM.equalsIgnoreCase("h"));

        counter++;

        if (counter == 1) {//bunu yazmazsak Arrayi tekrar tekrar yazdirir.
            SansliKullanici snslKlnc = new SansliKullanici();
            snslKlnc.sansliKullaniciYazdir(listKullaniciId,listKullaniciSaniye);

        }


    }

}
