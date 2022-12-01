package day08_loops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin

       // Scanner input = new Scanner (System.in);
        //System.out.println("Bir baslangic degeri giriniz");

        int baslangic = 6;
        int bitis =70;
        int artis = 5;

        for (int i = baslangic; i < bitis  ; i=i+artis) {

            System.out.print(i+ ",");
        }
        System.out.print(bitis);

















    }
}
