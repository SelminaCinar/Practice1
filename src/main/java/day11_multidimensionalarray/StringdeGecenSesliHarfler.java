package day11_multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class StringdeGecenSesliHarfler {
    public static void main(String[] args) {

        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Bir String cumle giriniz.");
        String str = input.nextLine();

        String arr[]=str.split("");//cumleyi arraye donusturduk
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].equalsIgnoreCase("a")||
            arr[i].equalsIgnoreCase("e")||
            arr[i].equalsIgnoreCase("u")||
            arr[i].equalsIgnoreCase("o")||
            arr[i].equalsIgnoreCase("i"))
            {
                System.out.print(arr[i]);


            }




        }







    }
}
