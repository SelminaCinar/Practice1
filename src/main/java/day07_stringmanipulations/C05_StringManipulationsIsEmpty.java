package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {
    public static void main(String[] args) {


        String str = "Hi";
        System.out.println(str.isEmpty());//false


        String str1 = "";
        System.out.println(str1.isEmpty());//true

        String str2 = " ";
        System.out.println(str2.isEmpty());//false

        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz

        String str3 = "Kelime";
        if(str3.isEmpty()){
            System.out.println("bosluk var");
        }else{
            System.out.println("bosluk yok");
        }















    }
}
