package day07_stringmanipulations;

public class C04_StringManipulationStartsWithEndsWith {

    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle = "Kazananları hic hata yapmayanlar degil,vazgecmeyenlerdir";

        //K ile başlıyor mu
        System.out.println(cumle.startsWith("K"));

        //dir ile bitiyor mu
        System.out.println(cumle.endsWith("dir"));

    }
}
