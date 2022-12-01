package day12_localdatetimevarargsOverloadingOverriding;

public class C04_Varargs {
    public static void main(String[] args) {


        System.out.println("a1" + a1(true, false, true, true));
        a2(1,2,3,4);
    }

    private static void a2(int i, int... i1) {
        System.out.println(i1.length);
    }


    private static int a1(boolean b, boolean... b3) {
        return b3.length;

    }


}
