package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P01_nesif_else_Vucut_kitle_Hesabi {
    public static void main(String[] args) {


     /*
     Kilo hesaabi
      kullanicadan kilo  ve boy olcusuni isteyin
      vucut kitle endeksini saplayin (kilo*1000 / (boy *boy)
      vucut kitle endeksi 30 dan buyukse obez
      25  30 arasi kilolu
      20-25 arasi ise normal
      20 den kucekse zayif
      */


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz ");

        double kilo= scan.nextDouble();

        System.out.println("Lutfen bouunuz giriniz");

        double boy= scan.nextDouble();

        double vucutKitle=(kilo*10000 / (boy*boy));

        System.out.println("vucutKitle = " + vucutKitle);

        if (vucutKitle>30){

            System.out.println("Obez");


        } else if (vucutKitle > 25) {

            System.out.println("Kilolusunuz");


        } else if (vucutKitle > 20 ) {

            System.out.println("Kilonuz Normaldir");


        }else {
            System.out.println("Zayifsiniz");
        }

    }
    }