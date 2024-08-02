package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;

public class p08_ifelse_statement {

    public static void main(String[] args) {

        /*
         Kullanıcıdan 2 adet vize 1 adet final notu alınsın
        Vize ortalamasının %40'ı Final Notunun %60'ını alarak
        Bir yıl sonu notu oluştursun
        Yıl Sonu notu:  90-100 arası ise AA
                        85-90 arası ise BA
                        80-85 arası ise BB
                        75-80 arası ise CB
                        65-75 arası ise CC
                        60-65 arası ise DC
                        50-60 arası ise DD
                        50 altı ise FF yazdırsın
         */


        Scanner scan=new Scanner(System.in);


        System.out.println("Lutfen Vize Notlarinizi sirasi ile giriniz");

        System.out.println("1.Vize Notu");

        double vize1= scan.nextDouble();;

        System.out.println("2.Vize Notu");

        double vize2= scan.nextDouble();

        System.out.println("Final Notu");

        double finalNotu= scan.nextDouble();

        double vizeortalama= (vize1+vize2)/2;

        double yilsonuNotu= (vizeortalama*0.40 + finalNotu*0.60);

        if (yilsonuNotu>=100){


        }else {
            System.out.println("Yil Sonu Notu "+ yilsonuNotu);


        }
        if (yilsonuNotu>100){

            System.out.println("Haci sen ne naaptin 100 den buyuk ortalam mi olur");

        } else if (yilsonuNotu>=90) {

            System.out.println("Yil Sonu Notu AA");

        } else if (yilsonuNotu>=85) {

            System.out.println("Yil Sonu Notu BA");


        } else if (yilsonuNotu>=80) {
            System.out.println("Yil Sonu Notu BB");

        } else if (yilsonuNotu>=75) {
            System.out.println("Yil Sonu Notu CB");


        } else if (yilsonuNotu>=65) {

            System.out.println("Yil Sonu Notu CC");

        } else if (yilsonuNotu>=60) {
            System.out.println("Yil Sonu Notu DC");


        } else if (yilsonuNotu>=50) {
            System.out.println("Yil Sonu Notu DD");


        }else {  //bir ihtimeraller zinciri kontrol edilerken "else if" bitince else yani hicbiri degilse
            System.out.println("FF");
        }

    }
}
