package day32Maps;

import java.util.HashSet;
import java.util.Set;

public class P02_hashset {

    public static void main(String[] args) {
        
        Set<Integer> sayilar= new HashSet<>();
        // ayni elemanda ikitane kullanma ihtimali olmaz
        sayilar.add(13);
        sayilar.add(10);
        sayilar.add(25);
        sayilar.add(30);
        sayilar.add(12);
        sayilar.add(40);
        sayilar.add(50);

        System.out.println("sayilar = " + sayilar);

        // set icinde ki cift toplasin
        int toplam=0;
        for (Integer each : sayilar) {

            if (each % 2== 0){

                toplam+=each;
            }
        }
        System.out.println(toplam);
    }
}
