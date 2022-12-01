package day13_overridingandoverloadingstatickeywords;

public class C01_Varargs {

    public static void main(String[] args) {

        //Verilen sayilardan ilki haric tum sayilari toplayip ilk sayiyla carpan bir method olusturun.

        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;
        
       toplam (sayi1,sayi2,sayi3,sayi4,sayi5);
       
        

    }

    private static void toplam(int sayi1, int...toplanacakSayi) {
        
        
        int sum = 0;

        for (int w:toplanacakSayi) {//ilk sayiyi haric tuttuk

            sum+=w;
        }
        System.out.println(sum);//22
        System.out.println("Toplam ile ilk sayinin carpimi" + (sum*sayi1));//110
    }
}
