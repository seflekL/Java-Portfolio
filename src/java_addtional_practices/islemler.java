package java_addtional_practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class islemler {
    Scanner scan = new Scanner(System.in);
    Map<Integer, urun> urunler = new HashMap<>();
    double tutar = 0;
    ArrayList <String>sepet=new ArrayList<>();

    void urunlisteleme(Map<Integer, urun> urunler) {

        System.out.println();
        for (Map.Entry<Integer, urun> entrty : urunler.entrySet()) {
            System.out.println(entrty.getKey() + " " + entrty.getValue().urunAdi + " " + entrty.getValue().getUruFiyat());

        }


    }

    void alisveris() {
        try {

            System.out.println("Satin almak istediginiz urunu kodunu giriniz");
            int kod = scan.nextInt();
            System.out.println("Satin almak istediginiz urunun miktarini giriniz");
            double miktar = scan.nextInt();

            System.out.println("urun kodu" + kod + "olan" + urunler.get(kod).getUrunAdi() + miktar + "KG alindi");
            tutar += miktar * urunler.get(kod).getUruFiyat();
            String sepetUrun="urun kodu" + kod + "olan" + urunler.get(kod).getUrunAdi()+miktar;
            sepet.add(sepetUrun);


        } catch (NullPointerException e) {
            System.out.println("Hatali urun kodu girdiniz Lutfen tekrar deneyiniz");
            alisveris();
        }

        System.out.println("Baska urun istermisiniz E/H cevpalayiniz");
        String devam=scan.next();
        if (devam.equalsIgnoreCase("H")){

            System.out.println("Baska urun aliniyor");
        }else {
            alisveris();
        }

    }
    void sepetGoruntuleme(){

        for (String  septekiKurabiye : sepet) {
            System.out.println(septekiKurabiye);

        }

    }
    void odeme() {

        System.out.println("Odenecek toplam tutar");
        double nakit=0;
        do{


        System.out.println("Nakit Girisi Yapiniz");
          nakit+=scan.nextDouble();
        if (tutar>nakit){
            System.out.println("Yetersiz giris yaptiniz");
            System.out.println(tutar-nakit+"kadar daha para girmelisiniz");
        }
    }while (tutar>nakit);


        if (tutar==nakit){

            System.out.println("Odeme icin tesekku ederiz, yine bekleriz");
            System.exit(0);
        } else {
            System.out.println("Para uste hesaplaniyor");
            double paraustu=nakit-tutar;
            System.out.println(paraustu+"para usutunuz aliniz");
            System.exit(0);
        }
        }
    }
