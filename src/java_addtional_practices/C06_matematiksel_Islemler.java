package java_addtional_practices;

import java.util.Scanner;

public class C06_matematiksel_Islemler {

    public static void main(String[] args) {

        /*

        Kullanicidan iki tamsayi alin, kullaniciya sonucu tam sayi mi yoksa ondalikli olarak
        mi istedigini sorun,
         kullanicinin tercihine gore sayi/sayi2 sonucunu yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki tam sayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("Lutfen tercihhinizi girniz \n1 sonucu tam sayi olarak istiyorun " +
                " \n2 sonucu ondalik yazidirin");
        int tercih= scan.nextInt();

        if ( tercih==1 ){
            System.out.println("iki sayinin bolumu" +sayi1/sayi2 );
        } else if (tercih==2) {

            System.out.println("Bolme sonucnun ondalikli hali: "+
                    (double)sayi1/sayi2);//sayinin birtanesini double yapinca sonucu
                                          //dogru yazaciktir disina koyma double koyma


        }
    }


}
