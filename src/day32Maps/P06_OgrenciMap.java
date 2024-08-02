package day32Maps;

import java.util.Map;

public class P06_OgrenciMap {
    public static void main(String[] args) {

        Map <Integer, String> Ogrencimap=mapdepo.mapOlustur();

        System.out.println(Ogrencimap.get(106));

        System.out.println(Ogrencimap.values());
//ogreni alan bilgisi
        System.out.println(mapdepo.getBolum(Ogrencimap, 105));
//ogrenci sinif builgisi
        System.out.println(mapdepo.getsinif(Ogrencimap,104));


        //kullanicadan nuarmayi ve istedigi bilgiyi olrak getirisin

        System.out.println(mapdepo.getData(Ogrencimap,105,"ad"));
        System.out.println(mapdepo.getData(Ogrencimap,105,"soyad"));

     }
     }
