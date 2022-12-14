package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir pozitif sayi giriniz");
        int sayi = input.nextInt();

        String sonuc = (sayi > 0) ? (sayi > 99 && sayi < 1000) ? ("3 basamakli sifirdan buyuk sayi") :
                (sayi % 2 == 0) ? (" 3 basamakli olmayan cift sayi ") : ("3 basamakli olmayan tek sayi") :
                "Lutfen sifirdan buyuk bir sayi giriniz";
        System.out.println("sonuc = " + sonuc);


        System.out.println();


        System.out.println("***********if***********");

        if(sayi>0) {
            if (sayi < 1000 && sayi > 99) {
                System.out.println("3 basamakli pozitif sayi");
            } else if (sayi % 2 == 0) {
                System.out.println("3 basamakli olmayan cift sayi");
            } else {
                System.out.println("3 basamakli olmayan tek sayi");
            }
        }else{
            System.out.println("Lutfen sifirdan buyuk pozitif bir tam sayi giriniz");
            }
        }


    }

