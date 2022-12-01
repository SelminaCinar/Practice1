package day_12localdatetimevarargsOverloadingOverriding;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_LocalDateTime {

    /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
   Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun sonra dogdu.
   Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
   Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */

    public static void main(String[] args) {

        LocalDate dogTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogTom);

        LocalDate dogVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dogVeli);

        boolean ayniMi = dogTom.isEqual(dogVeli);
        System.out.println(ayniMi);


        //İki saat dilimi arasindaki farki hesaplama
        //Japonya ile Almanya arasindaki saat farkini hesaplatan kodu yaziniz.

        LocalDateTime farkJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime farkGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long fark = ChronoUnit.HOURS.between(farkGermany, farkJapan);

        System.out.println(fark);

        ////Ex: Tarih 2022-10-31 ve saat 03:26:00pm.oldugunda asagidaki kod ne yazdirir?

        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time.plusHours(2)));//05:26:00

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time.minusHours(2)));//02:26:003

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(dtf3.format(time.plusHours(2)));//05:26:00+-

        //gun ay yil olarak yazdirma

        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(dtf4.format(date));//01-Kasım-22

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dtf5.format(date));//11-01-2022

        //mevcut saat diliminden ileri geri gitme
        //2 saat ileri
        LocalTime time2 = LocalTime.now();
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(time2.plusHours(2)));//12:49:00



    }
}
