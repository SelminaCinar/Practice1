package day02_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli sayi bir sayi giriniz");
        
        int num =input.nextInt();
        int ilkIkirkm=num/1000;
        System.out.println("ilkIkirkm = " + ilkIkirkm);
        int ilkIkiTop = (ilkIkirkm%10) + (ilkIkirkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);


         int sonIkiRkm = num%100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);
        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        
        int toplam = ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplam);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
