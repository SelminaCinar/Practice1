package day13_overridingandoverloadingstatickeywords;

public class C02_Overloading {

    public static void main(String[] args) {

        //Ayni classta ayni isimde method olusturmak icin method signature degistirilir.

       cikarma(98,(float)52.666);
       cikarma(14.5,3);
       toplama(55,66);
       toplama(2.3,4.5);
       carpma(2,3);
       carpma(8.9,32);
    }
 //Data Typelari degistirilerek overloading
    private static void carpma(double v, int i) {
        System.out.println("double ile int carpma yapildi " + (v*i));
    }

    private static void carpma(int i, int i1) {
        System.out.println("Iki int deger carpma yapildi" + (i*i1));
    }

    private static void toplama(double v, double v1) {
        System.out.println("Iki double deger toplandi " + (v+v1));
    }

    private static void toplama(int i, int i1) {
        System.out.println("Iki int deger toplandı " + (i+i1));
    }

    private static void cikarma(double v, int i) {

        System.out.println("double ile int cikarma yontemi " + (v-i));
    }

    private static void cikarma(int i, float v) {

       System.out.println("int bir deger ile float cikarma yontemi " + (i-v));


    }
   // Parametrelerin sayisini degistirerek overloading
    private static void toplama(double v, double v1,double v2) {
        System.out.println("Iki double deger toplandi " + (v+v1+v2));
    }

    private static void toplama(double v, double v1,double v2,double v3) {
        System.out.println("Iki double deger toplandi " + (v+v1+v2+v3));
    }


}
