package day09_StrigManipulation;

import java.util.Scanner;

public class p02_indexofstring {
    public static void main(String[] args) {
        /*
        Kullanicidan bir String ve aranacak metin alin.
                String'in aranan metni icerip icermedigini
        indexOf( ) method'u kullanarak yazdirin.

                */

        Scanner  scan=new Scanner(System.in);
        System.out.print("Lütfen bir cimle giriniz: ");
        String cumle=scan.nextLine();

        System.out.println("Lütfen cümlede aradığınız metni giriniz: ");
        String metin= scan.nextLine();

        //System.out.println(cumle.contains(metin)); //true

        // System.out.println(cumle.indexOf(metin));
        //-1  donerse o metin yoktur 0 ve daha başak bir pozitif değer dönerse o metin vardır

        if (cumle.indexOf(metin)>=0){
            System.out.println("Aradığınız "+metin+" kelimesi cümle içinde vardır");
        }else{
            System.out.println("Aradığınız "+metin+" kelimesi cümle içinde yoktur");
        }

        //cümlenin ikinci yarısında var mı?
        if(cumle.indexOf(metin,(cumle.length()/2))>=0){
            System.out.println("Aradığınız "+metin+" kelimesi cümlenin ikinci yarısında  vardır");
        }else{
            System.out.println("Aradığınız "+metin+" kelimesi cümlenin ikinci yarısında yoktur");
        }

        //cumlenin ilk yarısında var mı?
        if(cumle.lastIndexOf(metin,(cumle.length()/2))>=0){
            System.out.println("Aradığınız "+metin+" kelimesi cümlenin ilk yarısında  vardır");
        }else{
            System.out.println("Aradığınız "+metin+" kelimesi cümlenin ilk yarısında yoktur");
        }

                //ikinci kez kullanilmis mi nasil bulurus

        String str="Ali topu at, at ali at";

        int ilkindex=str.indexOf("at");


        System.out.println(str.indexOf("at",ilkindex+3));


    }



}
