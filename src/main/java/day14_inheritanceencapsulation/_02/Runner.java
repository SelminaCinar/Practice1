package day14_inheritanceencapsulation._02;

import static day14_inheritanceencapsulation._02.Kayit.counter;

public class Runner {

    public static void main(String[] args) {

        Kayit obj = new Kayit();

        obj.kayit();
        System.out.println(counter + "kez dogru kullanici girisi yapildi");

    }
}
