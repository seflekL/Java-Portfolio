package java_addtional_practices;

import java.util.Scanner;

public class L11_WhileLoop_Soru5 {

    /*
    Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun.
     */
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Üssü alınacak bir sayı giriniz");
            int sayi = scan.nextInt();
            System.out.println("üs miktarını giriniz:");
            int us = scan.nextInt();

            usAl(sayi, us);
        }

        private static void usAl ( int sayi, int us){

            int sonuc = 1;
            while (us > 0) {
                sonuc *= sayi;
                us--;
            }
            System.out.println(sonuc);
        }
    }