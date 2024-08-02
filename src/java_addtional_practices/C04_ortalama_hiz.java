package java_addtional_practices;

import java.util.Scanner;

public class C04_ortalama_hiz {

    public static void main(String[] args) {

        //6- Kullanicidan gittigi toplam yolu km olarak ve gittigi sureyi dakika olarak alin.
        //   Ortalama hizini tam sayi olarak ve ondalikli sayi olarak yazdirin

        Scanner scan=new Scanner(System.in);


        System.out.println("Bugun toplam kac km yol gittiniz");

        double mesafe= scan.nextDouble();

        System.out.println("Bugun toplam kac dakika yol gittiniz");

        double sureDakika= scan.nextDouble();

        double suresaat = sureDakika/60;

        double ortalamahizondalikli= mesafe / suresaat;

        System.out.println("Yolboyunca ortalama hiziniz"+ortalamahizondalikli+ "Km/Saat");
        
        int ortalamiHiztamsayi= (int)ortalamahizondalikli;

        System.out.println("ortalamiHiztamsayi = " + ortalamiHiztamsayi);

        



    }
}
