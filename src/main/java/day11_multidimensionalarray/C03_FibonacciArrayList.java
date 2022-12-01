package day11_multidimensionalarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_FibonacciArrayList {

    public static void main(String[] args) {

         /*
           INTERWIEW
        Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
           0-1-1-2-3-5-8-13-21-34....
         */

        List<Integer> fibonacchi = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz.");
        int sayi = input.nextInt();

        fibonacchi.add(0);
        fibonacchi.add(1);

        int i = 1;

        if (sayi <= 1) {
            System.out.println("Lutfen 1'den buyuk bir sayi giriniz");
        } else {

            while (fibonacchi.get(i) < sayi) {

                fibonacchi.add(fibonacchi.get(i) + fibonacchi.get(i - 1));//bir önceki eleman ile topladık.

                i++;//bir basamak ilerlesin diye
            }
            if(fibonacchi.get(fibonacchi.size()-1)>sayi){//fibonacchide yer almıyorsa
                fibonacchi.remove(fibonacchi.size()-1);//son elemani sil

                System.out.println("Girdiginiz sayi fibonacchi'de yer almıyor. Girilen sayiya kadar ki fibonacchi " +fibonacchi);

            }else{
                System.out.println("Girdiginiz sayi bir fibonacchi sayisidir "+fibonacchi);
            }


        }


    }
}
