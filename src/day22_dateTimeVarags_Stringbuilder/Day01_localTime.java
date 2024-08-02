package day22_dateTimeVarags_Stringbuilder;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day01_localTime {

    public static void main(String[] args) {


        LocalTime time = LocalTime.now();

        System.out.println(time);
        LocalTime istenenSaat= LocalTime.of(21,15,35);


        LocalTime baslangic=LocalTime.now();

        for (int i = 0; i <1000000 ; i++) {
            for (int j = 0; j < 100000; j++) {
                for (int k = 0; k < 3; k++) {


                }

            }

        }
        LocalTime bitis=LocalTime.now();

        System.out.println(bitis.toSecondOfDay()-baslangic.toSecondOfDay());
        System.out.println(bitis.toNanoOfDay()-baslangic.toSecondOfDay());

        System.out.println((baslangic.until(bitis, ChronoUnit.SECONDS)));

        System.out.println(time.getHour());

        System.out.println(time.getHour()+time.getMinute());


    }
}
