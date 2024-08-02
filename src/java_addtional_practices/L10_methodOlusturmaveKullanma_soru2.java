package java_addtional_practices;

public class L10_methodOlusturmaveKullanma_soru2 {
/*

 Kullanicidan main method icinde  ayri ayri isim ve soyismini alin
 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
 input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz
 */
    public static void main(String[] args) {

        isimsoyisim("ALI","YILMAZ");




    }

    public static void isimsoyisim(String isim,String soyIsim) {

        System.out.println(isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1 )+
                "  "+soyIsim.toUpperCase().charAt(0)+soyIsim.toLowerCase().substring(1));

     }
}
