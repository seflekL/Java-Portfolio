package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P01_jIf_esle_marketHesabi {
    public static void main(String[] args) {

        /*
        KULLANICIYA ALDIGI URUN ADEDINI VE INDIRIMSIZ FIYATINI ALIN
        KULLANICIYA MUSTERI KARTI OLUP OLMADIGINI SORUN
        MUSTERI KARTI VARSA 10 URUNDEN FAZLA ALIRSA %20 AZ ALIRSA %15 INDIIRM YAPIN
        MUSTERI KARTI YOKSA 10 URUDEN FAZLA ALIRSA %115 AZ ALIRSA %10
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("Indirimsiz Indirimsiz fiyatini giriniz");
        double indirimsizFiyat = scan.nextDouble();
        double toplamfiyat = (indirimsizFiyat * urunAdedi);
        System.out.println("Wise Musteri Kartiniz var mi E/H");
        char musteriKart = scan.next().toUpperCase().charAt(0);

        if (musteriKart == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli toplam fiyat" + toplamfiyat * 80 / 100);
        } else if (musteriKart == 'E') { // && urunAdedi<=10) on dan az olanlar kaldigi icin gefrek yok
            System.out.println("%15 indirimli toplam fiyati " + toplamfiyat * 85 / 100);

        } else if (musteriKart == 'H' && urunAdedi > 10) {
            System.out.println("%15 toplam indirim fiyati" + toplamfiyat * 85 / 100);


        } else if (musteriKart == 'H' && urunAdedi <= 10) {

            System.out.println("Indirimli %10 fiyati " + toplamfiyat * 0.90 / 100);
        } else {
            System.out.println("Bilgileri tekrar kontrol edin ");
        }
    }
}
