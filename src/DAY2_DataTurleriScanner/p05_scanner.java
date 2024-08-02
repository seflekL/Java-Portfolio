package DAY2_DataTurleriScanner;

import java.util.Scanner;

public class p05_scanner {
    public static void main(String[] args) {

        //kullanicadan veri(ornegin ismini yasini vb) veri almak icin
        //scanner class kullaniriz

        //Soru Kullanicadan ismini alip uazdirin

        //1.adim scanner calssdan obje olustur.

        Scanner scan=new Scanner(System.in);

        //2.Adim Kullanicadan isyetegimiz veri icin bir aciklama yazdiriyoruz

        System.out.println("Lutfen Adinizi Giriniz ");

        //3.adim Istedimigimiz bilginin data turune scanner objesi uzerinden method kullan.

        String girilenIsim=scan.nextLine();
        //next(): Girilen Sting ifadeyi ilk bosluga kadar alir Levent
        //nextLine(): Girlien ifadenin tamamani alir Levent Kadri
        System.out.println(girilenIsim);


    }
}
