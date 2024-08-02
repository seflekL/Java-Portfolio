package day32Maps;

import java.util.HashMap;
import java.util.Map;

public class P05_mapOlusturma {
    public static void main(String[] args) {

        Map <Integer, String> ogrenciMap=new HashMap<>();

        //Bir okul sisteminde kayit edilen ogrencileri
        //No isim soyisim  sinif sube alan  veri alicak
        //key olarak no alicak ve benzseris sekilde atanacak
        //Geriye kalan  isim soyisim  sinif sube alan bilgilerini iste tek bir valu olucak sekilde
        //strin yapicak
        //isim-soyisim-sinif-sube-alan bigiler  bradaki gibi ayni aracla ayrilmis olmalidir

        ogrenciMap.put(101,"Ali-Can-11-A-SAY");
        ogrenciMap.put(102,"Murat-Can-11-A-SAY");
        ogrenciMap.put(103,"Serpil-Can-11-A-SOZ");
        ogrenciMap.put(104,"Neslian-Can-11-A-SAY");
        ogrenciMap.put(105,"Levent-Can-11-A-EA");
        ogrenciMap.put(106,"Bonomo-Can-11-A-SAY");
        ogrenciMap.put(107,"Kocyyigit-Berk-10-A-SOZ"); // ya tire ayda virgul hep kullan

        //map icindeki ogrencileri getirme

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106, 107]

        //103 numrali ogrencini bilgilerine yazdiraliam

        System.out.println(ogrenciMap.get(103));//103 ogrenciyi yazdir//Serpil-Can-11-A-SOZ

        //Database de kayitli tum bilgileri getirisin

        System.out.println(ogrenciMap.values()); //[Ali-Can-11-A-SAY, Mura-Can-11-A-SAY, Serpil-Can-11-A-SOZ, Neslian-Can-11-A-SAY, Levent-Can-11-A-EA, Bonomo-Can-11-A-SAY, Kocyyigit-Berk-10-A-SOZ]

        //105 numarali ogrenci var mi

        System.out.println(ogrenciMap.containsKey(105)); //true

        //ismi Murat olan ogenci var mi

        System.out.println(ogrenciMap.containsValue("Murat")); //false //murat ismi varmi olmasina
        //ragmen cunkubutun satiri degerlendiriyor

        System.out.println(ogrenciMap.containsValue("Murat-Can-11-A-SAY"));// true gelir taamamini butun aldi


    }
}
