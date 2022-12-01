package day11_multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class C02_MultidimensionalArraysMaxMin {

    public static void main(String[] args) {
          /*
        Kullanıcının girdigi bir array'in en buyuk elemani ile
        en kucuk elemanının  farkını bulan kodu yaziniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin uzunlugunu giriniz.");

        int uzunluk = input.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk ; i++) {

            System.out.println("Arrayin "+ (i+1) +" .elemani giriniz");
            arr[i]=input.nextInt();

        }
        Arrays.sort(arr);

        System.out.println(" Arrayin en buyuk elemani :"+arr[uzunluk-1]);//bu en buyugu verir
        System.out.println(" Arrayin en kucuk elemani :"+arr[0]);//ilk indexteki en kucugu verir
        System.out.println(arr[uzunluk-1]-arr[0]);

    }
}
