package java_addtional_practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S04_SicaklikGostArrayList {
    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // 100 girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> gununSicakliklari = new ArrayList<>();

        double girilenSicaklik = 0;// ondalik sayida virgül yazalim

        int sonlandirmaSayisi = 100;
        int sayac = 0;

        System.out.println("Sicaklik degerlerini giriniz. Veri girisini sonlandirmak icin q yaziniz");


        do {
            System.out.println("Deger giriniz");
            girilenSicaklik = scan.nextDouble();

            if (girilenSicaklik != 100) {
                gununSicakliklari.add(girilenSicaklik);
                sayac++;
            }

        } while (girilenSicaklik != 100);
        {
            System.out.println("Veri girisi sonlandirildi");
        }

        Collections.sort(gununSicakliklari);
        System.out.println("Günün en düsük sicaklik degeri : " + gununSicakliklari.get(0));
        System.out.println("Girilen deger sayisi: " + gununSicakliklari.size());
        System.out.println("Günün en yüksek sicaklik degeri" + gununSicakliklari.get(sayac - 1));

    }}
