package day12_Methodolusturma;

import java.util.Scanner;

public class C06_method_olusturma_soru2_isimDuzenle {

    public static void main(String[] args) {
        /*
        Kullanicadan main method icind ayri ayri sim ve soy isim alin
        isim ve soy isim ilk arfleri buyukl diger harfleri kucuk olcauk sekilde duzenleyin
        ims bolsuk soysim seklinde donduren bir method olustrurun
        input : isim : ali soyisim Yilmaz output : Ali yilmaz
                 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi Giriniz");
        String isim= scan.nextLine();

        System.out.println("Soy isiminizi giriniz");
        String soyIsim= scan.nextLine();
        //Method bize bir string dondurdugu icin
        //ya hemen donen String'i yazdiririz
        //veya sonra kullanilmak uzere kaydereriz

        String duzenlenmisIsim=isimDuzenle(isim,soyIsim);
        System.out.println(isimDuzenle(isim,soyIsim));
    }

    public static String isimDuzenle(String isim, String soyIsim){

        String duzenlenmisIsim= isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase() + " " +
                soyIsim.substring(0,1).toUpperCase()+ soyIsim.substring(1).toLowerCase();

        return duzenlenmisIsim;

    }

}
