package day11_multidimensionalarray;

public class C04_IncrementDecrementSorusu {
    public static void main(String[] args) {

        int a = 15;

        int b = a++;

        System.out.println(b);//15
        System.out.println(a);//16


        int s1 = 10;
        int s2 = 20;
        int s3 = 30;

        s2 = s1++;

        System.out.println(s1 + "," + s2 + "," + s3);//11,10,30

        s3 = ++s1;//11
        s3 = ++s1;//12
        System.out.println(s3++);

    }
}
