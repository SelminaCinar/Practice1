package day13_overridingandoverloadingstatickeywords;

import java.util.Scanner;

public class Test {

    //Kullanici A : Ayse ; kullanici B Burak ismini data olarak girerse cıktı ne olur ?

    String stdName;
    String year = "2020";
    String stdId;
    static int counter = 1000;

    public Test() {
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        stdName = input.next();
        setstdId();
    }

    private void setstdId() {
        counter++;
        this.stdId = year + "" + counter;
    }

    public static void main(String[] args) {

        Test std1 = new Test();
        System.out.println(std1.stdName + std1.stdId);//A
        Test std2 = new Test();
        System.out.println(std2.stdName + std2.stdId);//B


    }
}
