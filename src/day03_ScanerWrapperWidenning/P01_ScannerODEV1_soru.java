package day03_ScanerWrapperWidenning;

import java.util.Scanner;

public class P01_ScannerODEV1_soru {
    public static void main(String[] args) {

        /*
        Kullanicadan uc farkli data turunde deger alip girin degerlri aciklamaya yazdirin
         */

        Scanner scan=new Scanner(System.in);

        //String
        System.out.println("Lutfen adinizi giriniz");
        String  name= scan.next();
        System.out.println("Adiniz = " + name);


        System.out.println("Lutfen Soyadinizi Giriniz");
        String  surname= scan.next();

        System.out.println("Soyadiniz = " + surname);

        System.out.println("Lutfen Telefon numariniz Giriniz");
        int telNo= scan.nextInt();
        System.out.println("telNo = " + telNo);

       // char harf=scan.next().charAt(0);  char degerin ilk harfini alir dipnot


        System.out.println("Lutfen Ondalikli bir sayi girin ");
        double sayi= scan.nextDouble();
        System.out.println("sayi = " + sayi);
        //scan.next(); eger atlama yaparsa scannext veya scan nextline ekleyin atlayan yere ekliniyor
        System.out.println("Lutfen email adresinizi giriniz");
        String   email= scan.next();
        System.out.println("email = " + email);






    }
}

