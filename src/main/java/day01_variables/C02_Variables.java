package day01_variables;

public class C02_Variables {
    public static void main(String[] args) {

        int s = 144 ;
        float d = 12.628F;
        String okulIsmi = "Techpro";

        System.out.println("okulIsmi = " + okulIsmi);
        System.out.println("s = " + s);
        System.out.println("d = " + d);

        String isim = "Selmina";
        String soyIsim ="Cinar";

        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);

        int sayi1=24;
        short sayi2=38;

        System.out.println("Iki farkli data turunun toplami : " + (sayi1+sayi2));

        int toplam =sayi1+sayi2;
        System.out.println("toplam = " + toplam);

        int deger1 = 122;
        float deger2= 177.9F;

        System.out.println("Sonuc : " + (deger1+deger2));

        char ismininIlkHarfi='S';
        System.out.println("ismininIlkHarfi = " + ismininIlkHarfi);

        //Bir tam sayi ile bir harfi toplayiniz.

         int deger3=20;
         char harf='s';

         //1.Yol
        int toplam1 =deger3+harf;
        System.out.println("toplam1 = " + toplam1);

        //2.Yol
        System.out.println("harf = " + (harf+deger3));


    }
}
