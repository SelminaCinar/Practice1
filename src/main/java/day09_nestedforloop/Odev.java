package day09_nestedforloop;

public class Odev {
    //        1 2 3 4 5 6
    //         2 3 4 5 6
    //          3 4 5 6
    //           4 5 6
    //            5 6
    //             6


    public static void main(String[] args) {

//
//        for (int i=1; i<=6; i++){
//            for (int b=0; b<i; b++){
//                System.out.print(" ");
//            }
//            for (int k=i; k<=6; k++){
//                System.out.print(k + " ");
//            }
//            System.out.println();
//        }
        int sayi = 0;
        for (int i = 1; i <= 6; i++) {


            for (int j = i; j <=6; j++) {
                sayi--;
                System.out.println(" ");

            }
            for (int k = i; k <= 0; k--) {



            }
            System.out.println(i);

        }


    }


}
