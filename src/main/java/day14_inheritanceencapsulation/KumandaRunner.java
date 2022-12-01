package day14_inheritanceencapsulation;

public class KumandaRunner {
    public static void main(String[] args) {

        Test tv = new Test(102.10,80.00,40.45);

        tv.gucDugmesi();//kumandayla tvyi actim.

        System.out.println(tv.kanalDegistirme(3));//50.89

        System.out.println(tv.sesAzaltma());//11

        System.out.println(tv.sesArtırma());//11



    }
}
