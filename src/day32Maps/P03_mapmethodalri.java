package day32Maps;

import java.util.Map;

public class P03_mapmethodalri {
    public static void main(String[] args) {

        Map<Integer,String>ogrenci=mapdepo.mapOlustur();

        System.out.println(ogrenci);
        //{101=Ali-Can-11-A-SAY, 102=Murat-Can-11-A-SAY, 103=Serpil-Can-11-A-SOZ,
        // 104=Neslian-Can-11-A-SAY, 105=Levent-Can-11-A-EA,
        // 106=Bonomo-Can-11-A-SAY, 107=Kocyyigit-Berk-10-A-SOZ}

        //put methodu varsa  olani siler ekelr yoksa direk ekler
ogrenci.put(110,"Seva-Yigit-9-A-SAY");
ogrenci.put(102,"Murat-Yiğit-11-K-SAY");

        System.out.println(ogrenci);


        //replace method
        ogrenci.replace(107,"=Kocyyigit-Berk-10-A-SOZ","Kocyyigit-Berk-10-A-EA");

        //replace valude daki degerlri tolu ya bireyel olrak degisirtir fakat yeni degeleri gondeririken degimeyne de degsinler
        //string olarak geitirir

        //get method
        ogrenci.get(103);
        System.out.println(ogrenci.getOrDefault(120, "Boyle bir numara sahip ogrenci yoktur"));

    }
}
