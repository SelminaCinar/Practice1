package day13_overridingandoverloadingstatickeywords;

public class Try {

    int b = 10;
    static int a = 10;


    public static void main(String[] args) {

        Try t1 = new Try();
        Try t2 = new Try();
        t1.a = a + 2;
        t2.a = a + 3;
        System.out.println(t1.a);//15
        System.out.println(t2.a);//15


        Try t3 = new Try();
        Try t4 = new Try();
        t3.b = 12;
        t4.b = 13;
        System.out.println(t3.b);//12
        System.out.println(t4.b);//13

        //////////////////////////////////
        //Hangileri calisir ?
        m1(33f);
        m1(33,44);
//        m1(33.3,44);
//        m1(33.3);


    }

    private static void m1(int i, double i1) {
    }


    private static void m1(float v) {
    }


}
