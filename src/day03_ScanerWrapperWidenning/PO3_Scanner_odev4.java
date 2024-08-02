package day03_ScanerWrapperWidenning;

import java.util.Scanner;

public class PO3_Scanner_odev4 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
        //yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Alani bulunacak Dikdorgenin kisa ve uzun kenar olculerini giriniz");

        System.out.println("Kisa kenar uzunlugu giriniz");
        double kisaKenar= scan.nextDouble();
        System.out.println("Uzun kenar uzunlugunu giriniz");
        double uzunKenar= scan.nextDouble();
        double alan=(kisaKenar*uzunKenar);  //3.olarak ekelemek zorundadasin
        System.out.println("Dikdortgenin alani = " + alan);






    }
}
