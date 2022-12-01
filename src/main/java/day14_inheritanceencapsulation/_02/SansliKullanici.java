package day14_inheritanceencapsulation._02;

import java.util.ArrayList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullaniciYazdir(List<String> listKullaniciId, List<Integer> listKullaniciSaniye) {
        List<String> sansliKullaniciIndex = new ArrayList<>();

        for (int i = 0; i < listKullaniciSaniye.size(); i++) {

            if(listKullaniciSaniye.get(i)<10){
                sansliKullaniciIndex.add(listKullaniciId.get(i));

            }
        }
        System.out.println("Sansli kullanicilar");
        System.out.println(sansliKullaniciIndex);
    }
}
