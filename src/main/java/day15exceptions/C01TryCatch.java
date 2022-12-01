package day15exceptions;

public class C01TryCatch {

    //Verilen iki sayiyi 10 kez bolen kodu yaziniz.

    public static void main(String[] args) {

        int sayi1 = 100;
        int sayi2 = 5;


        //

        /*while (sayac<10){
            System.out.println(sayi1/sayi2);
            sayi2--;
            sayac++;
        }*/

//        System.out.println("******IF ELSE ILE******");
//
//        int sayac = 1;
//        while (sayac < 10) {
//
//            if (sayi2 == 0) {
//                System.out.println("Islem yapilirken payda sifir oldu");
//            } else {
//                System.out.println(sayi1 / sayi2);
//
//            }
//            sayi2--;
//            sayac++;
//        }

        System.out.println("******TRY CATCH ILE*******");

        int a = 100;
        int b = 5;
        int sayac1=1;

        while (sayac1<10){
            try {
                System.out.println(a/b);//ctrl+alt+t
            } catch (ArithmeticException e) {
                System.out.println("Payda sifir oldu " + e.getMessage());
            }
            b--;
            sayac1++;
        }

    }

}
