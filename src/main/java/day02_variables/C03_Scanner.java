package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz..");

        String kullaniciIsmi = input.next();//next ilk kelimeyi alır.


        System.out.println("Cemberin yarıcapini giriniz");

        double r = input.nextDouble();

        System.out.println("Cemberin cevresi" + 2*314*r/100);
        System.out.println("Dairenin Alani" + 3.14*r*r);

        System.out.println("Dikdortgenin uzun kenarini giriniz");
        double kisa = input.nextDouble();
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double uzun = input.nextDouble();
        System.out.println("Alan" + kisa*uzun );
        System.out.println("Cevre" + 2*(kisa+uzun));

        System.out.println("Ucgenin kenar uzunluklarini giriniz");

        byte a = input.nextByte();
        byte b =input.nextByte();
        byte c = input.nextByte();

        System.out.println("Ucgenin cevresi" + (a+b+c));


        System.out.println("Bir karakter giriniz");
        char ch = input.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);

        System.out.println("Bir karakter giriniz");
        char ch1  = input.next().charAt(0);
        System.out.println("  "+ch1+"  ");
        System.out.println(" "+ch1+" "+ch1);
        System.out.println(ch1+" "+ch1+" "+ch1);


    }
}
