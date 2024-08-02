package day22_dateTimeVarags_Stringbuilder;

import java.time.LocalDate;
import java.time.Period;

public class P02_Localdate {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();

        System.out.println("bugun = " + bugun);

        LocalDate istenenTarih=LocalDate.of(2005,03,22);

        System.out.println("istenenTarih = " + istenenTarih);

        LocalDate dogumGunu=LocalDate.of(1984,8,20);
        LocalDate eee=LocalDate.of(2023,06,03);
        System.out.println("eee = " + eee);

        System.out.println(bugun.getMonth()); // hangi ay oldugunu haziran
        System.out.println(bugun.getDayOfWeek());   // jaftanin hangi gun u
        System.out.println(bugun.getEra());  // hangi era da oldugumuz


        System.out.println(bugun.plusYears(5)); // bes yil sonra

        System.out.println(bugun.isLeapYear()); // hangi yildiyaz

        System.out.println(bugun.withYear(2025).isLeapYear()); //  2025 yiladamiyiz

        System.out.println(bugun.lengthOfYear());// yilda kac gun var

        System.out.println(bugun.withMonth(7).lengthOfYear());// 31 aydaki gun sayisi

        System.out.println(dogumGunu.until(bugun));//P39Y9M14D
        
        // eger iki tarih arasini bir periyod olarak kaydetmek istesek period  class kullan

        Period period =Period.between(dogumGunu,bugun);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("period = " + period);
    }
}
