package day_12localdatetimevarargsOverloadingOverriding;

import java.util.Scanner;

public class C01_LocalDateTime {

    // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi String olarak girin");
        String ay = input.nextLine();

        System.out.println("Dogdugunuz gun bilgisini yaziniz");
        int gun = input.nextInt();

        String burc = "";

        if (ay.equalsIgnoreCase("Ocak")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "Oglak";
        }
        if (ay.equalsIgnoreCase("Subat")) {
            if (gun > 20)
                burc = "Balık";
            else
                burc = "Kova";
        }
        if (ay.equalsIgnoreCase("Mart")) {
            if (gun > 21)
                burc = "Koc";
            else
                burc = "Balık";
        }
        if (ay.equalsIgnoreCase("Nisan")) {
            if (gun > 21)
                burc = "Boga";
            else
                burc = "Koc";
        }
        if (ay.equalsIgnoreCase("Mayıs")) {
            if (gun > 22)
                burc = "İkizler";
            else
                burc = "Boga";
        }
        if (ay.equalsIgnoreCase("Haziran")) {
            if (gun > 23)
                burc = "Yengec";
            else
                burc = "İkizler";
        }
        if (ay.equalsIgnoreCase("Temmuz")) {
            if (gun > 23)
                burc = "Aslan";
            else
                burc = "Yengec";
        }
        if (ay.equalsIgnoreCase("Agustos")) {
            if (gun > 23)
                burc = "Basak";
            else
                burc = "Aslan";
        }
        if (ay.equalsIgnoreCase("Eylul")) {
            if (gun > 23)
                burc = "Terazi";
            else
                burc = "Basak";
        }
        if (ay.equalsIgnoreCase("Ekim")) {
            if (gun > 23)
                burc = "Akrep";
            else
                burc = "Terazi";
        }
        if (ay.equalsIgnoreCase("Kasim")) {
            if (gun > 22)
                burc = "Yay";
            else
                burc = "Akrep";
        }
        if (ay.equalsIgnoreCase("Aralik")) {
            if (gun > 22)
                burc = "Oglak";
            else
                burc = "Yay";
        }

        System.out.println(gun+" "+ay+" "+" tarihinde dogduysaniz " + burc);


    }
}