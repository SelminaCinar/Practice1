package day05_ifstatement;

import java.util.Scanner;

public class C07_IfStatement {
    public static void main(String[] args) {

        //Kullanicidan dortgenin kenar uzunluklarini isteyin
        //ve dortgenin kare olup  olmadigini yazdirin

        Scanner input = new Scanner (System.in);
        System.out.println("Dortgenin 1.kenarını giriniz");
        int kenar1 = input.nextInt();

        System.out.println("Dortgenin 2. kenarını giriniz");
        int kenar2 = input.nextInt();

        System.out.println("Dortgenin 3. kenarını giriniz");
        int kenar3=input.nextInt();

        System.out.println("Dortgenin 4.kenarını giriniz");
        int kenar4=input.nextInt();

        if(kenar1==kenar2 && kenar2==kenar3 && kenar3 == kenar4){
            System.out.println("Bu cisim bir karedir");
        }else
            System.out.println("Kare değildir");
















































    }
}
