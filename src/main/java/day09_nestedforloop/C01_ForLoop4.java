package day09_nestedforloop;

import java.util.Scanner;

public class C01_ForLoop4 {
    public static void main(String[] args) {

        /*
   Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
*/

        Scanner input = new Scanner (System.in);
        System.out.println("bir string giriniz");
        String str = input.nextLine();

        int sayac = 0;

        for (int i = 0; i < str.length() ; i++) {

            if(str.charAt(i)=='a'){

                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }

        }
        System.out.println("C oncesi a sayısı  " + sayac );
    }
}
