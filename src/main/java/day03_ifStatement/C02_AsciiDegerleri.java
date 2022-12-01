package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

//        char harf = 'a';
//        char harf2='A';
//
//        System.out.println("harf>harf2 ==> " + (harf>harf2));//Karsilastirma islemlerinin sonucu true yada false döner.(boolean)

        //Buyuk harflerin ascii degerleri kucuk harflerin ascii degerlerinden kucuktur.

        //1)herhangi bir char variablenin ascii degerlerini ascii degerlerini kod yazarak bulunuz.

//        char harf3 = 's';
//        System.out.println(harf3+0);//1.yol 0 ile toplamak
//
//        int harf4 = 'M';
//        System.out.println("harf4 = " + harf4);//2.yol direkt yazdırmak
        //Java char karaktere int atayabiliriz.
        // Cunku charın bir resim karakteri birde matematiksel ASCİİ degeri vardır.
        //Atayabildigimiz icin ASCİİ degerleri hesaplayabiliriz.


        byte b1 = 12;
        byte b2= -125;
        System.out.println("b1>b2 ==> " + (b1>b2));

        float f1=2.45645F;
        float f2 = 5.86786F;
        System.out.println("f1>f2 ==> " + (f1>f2));
        System.out.println("b1>f1 ==> "+(b1>f1));

        long long1 = 545454545L;
        System.out.println("b1>long1 ==> " + (b1>long1));

        char ch = 'H';
        System.out.println("b1>ch ==> " + (b1>ch));















    }
}
