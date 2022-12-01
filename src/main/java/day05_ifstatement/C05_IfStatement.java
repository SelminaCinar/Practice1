package day05_ifstatement;

import java.util.Scanner;

public class C05_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double sayi = input.nextDouble();
        double sayi1 = input.nextDouble();


        if (sayi < sayi1) {
            System.out.println(" Buyuk olmayan sayi " + sayi);
        } else if (sayi > sayi1) {
            System.out.println("Buyuk olmayan sayi " + sayi1);
        } else {
            System.out.println("Sayilar birbirine esittir .");
        }

            System.out.println(sayi == sayi1 ? "Sayilar esit" : sayi > sayi1 ? sayi1 : sayi);







    }
}
