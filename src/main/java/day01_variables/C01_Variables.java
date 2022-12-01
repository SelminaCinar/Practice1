package day01_variables;

public class C01_Variables {
    public static void main(String[] args) {

        /*    tmm mı hocam tamamdır cok sagolun tekrar
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
    */
        System.out.println("Hello World");

        int level = 1;//acık gri göründügü icin gereksiz is yaptıgını söylüyor
        System.out.println(level);

        boolean ogrenciMi = true;
        boolean yagisVarMi = false;

        System.out.println("yagisVarMi = " + yagisVarMi);
        System.out.println(ogrenciMi);

        char sembol = '&';
        char ch = '2';

        System.out.println("sembol = " + sembol);
        System.out.println("ch = " + ch);

        double a = 0.2 , b=0.3;

        long theWorldPopulation = 70000000000L;
        long x = 1234;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("theWorldPopulation = " + theWorldPopulation);
        System.out.println("x = " + x);


    }
}
