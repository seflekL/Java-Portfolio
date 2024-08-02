package day32Maps;

import java.util.HashMap;
import java.util.Map;

public class mapdepo {

    public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> OgrenciMap = new HashMap<>();

        OgrenciMap.put(101, "Ali-Can-11-A-SAY");
        OgrenciMap.put(102, "Murat-Can-11-A-SAY");
        OgrenciMap.put(103, "Serpil-Can-11-A-SOZ");
        OgrenciMap.put(104, "Neslian-Can-11-A-SAY");
        OgrenciMap.put(105, "Levent-Can-11-A-EA");
        OgrenciMap.put(106, "Bonomo-Can-11-A-SAY");
        OgrenciMap.put(107, "Kocyyigit-Berk-10-A-SOZ"); // ya tire ayda virgul hep kullan

        return OgrenciMap;


    }
    public static String getBolum(Map<Integer, String> OgrenciMap,int istenenNO){
        String bilgi= OgrenciMap.get(istenenNO);// 107 ise "Kocyyigit-Berk-10-A-SOZ") geturir
        String [] arr = bilgi.split("-");//"Kocyyigit-Berk,10,A,SOZ")virgulu cevirdi
        //                                              0    1    2 3  4
        return arr[4];
        //retunde 4 elamani istedigimiz icin onu virgulu getiricek

    }
 public static String getsinif(Map<Integer, String> OgrenciMap,int istenenNO){
        String  bilgi = OgrenciMap.get(istenenNO);
        String [] arr=bilgi.split("-");


     return  arr[2]; // github tan kontrol et son kisim calismadi
 }

 public  static String getData(Map<Integer, String> OgrenciMap,int istenenNO,String istenenBilgi) {
     //ogrenci mapinde yer alan bilgileri bana dondurmesi lazim
     //istenen numaradaki olanlari isim,soyisim,sinif ,sube , alan seklinde getirsin

     String istenenOgrVAlue = OgrenciMap.get(istenenNO);
     String[] istenenOgrArr = istenenOgrVAlue.split("-");

     switch (istenenBilgi.toLowerCase()) {
         case "ad"  :
         case  "AD" :
             return istenenOgrArr[0];

         case "SOYAD":
         case "soyad" :

             return istenenOgrArr[1];

         case "SINIF":
         case "sinif":
             return istenenOgrArr[2];

         case "SUBE":
         case "sube":

             return istenenOgrArr[3];

         case "ALAN":
         case "alan":

             return istenenOgrArr[4];

         default:
           return "Arabab bilgi kayilarda mevcut degildir";
     }


 }

}


