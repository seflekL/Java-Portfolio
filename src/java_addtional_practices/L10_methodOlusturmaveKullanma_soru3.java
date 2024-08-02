package java_addtional_practices;

import java.util.Scanner;

public class L10_methodOlusturmaveKullanma_soru3 {
    /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.
     */

    public static void main(String[] args) {

        Scanner  scan= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= scan.nextInt();
        asalsayimethod(sayi);

    }

    public static String asalsayimethod(int sayi) {

        String sonuc = "Sayi Asal";

        for (int i = 2; i < sayi; i++) {

            if (sayi %i == 0) {

                System.out.println("sayi asal deggil");
            }

            }

        return sonuc;
        }
    }



