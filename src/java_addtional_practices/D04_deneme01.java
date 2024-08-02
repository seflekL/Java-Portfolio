package java_addtional_practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D04_deneme01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicaklari = new ArrayList<>();

        double girilasicaklik = 0;
        int sonSayi = 200;
        int flag = 0;

        System.out.println("Sicak degerlerini giriniz sonladimak icin 200 yaziniz");

        do {

            System.out.println("Lutfen sicaklik degerini giriniz");
            girilasicaklik = scan.nextDouble();

            if (girilasicaklik != 200) {
                gununSicaklari.add(girilasicaklik);
                flag++;
            }

        } while (girilasicaklik != 200);
        {
            System.out.println("Veri Girisi SOnlandirildi");
        }

        Collections.sort(gununSicaklari);

        System.out.println("Gunun enm dusuk Sicakligi deger"+ gununSicaklari.get(0));
        System.out.println("Girilen deger sayisi"+gununSicaklari.size());
        System.out.println("Gunun en yuksek sicaklik degeri"+gununSicaklari.get(flag-1));
    }
}