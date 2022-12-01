package day_14advanced;

public class C04_Exception_Throws {
    /*
   randomSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

    public static void main(String[] args) throws Exception {

        rastgeleSayi();

    }

    public static void rastgeleSayi() throws Exception {

        int a =(int) (Math.random()*11);
        int b =(int) (Math.random()*11);

        System.out.println(a+b);

        if(a+b<12){
            throw new Exception("Sayı 12'den küçük ise hata verir");
        }
    }
}
