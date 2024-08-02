package day04_wrapperClass_Char;

import java.util.Scanner;

public class P03_WrapperClass {
    public static void main(String[] args) {



        int sayi1=10;
        String str="Java";

        //Javada non primitive datalarin methorlari vardir

        System.out.println(str.toLowerCase());

        //primitive datalarin hazir mehorlari olmadigi icin
        //ihiyac halinde  hazir olan bazi methodlari  Wrapper Class olusturmustur
        //Integer,Double Byte ,Short, Long ,Blooen,char)

        Integer sayi2=20;

        String sayi3="25";
        String sayi4="43";

        System.out.println(sayi3+sayi4);//2543

        int sayi5=Integer.parseInt(sayi3);
        int sayi6=Integer.parseInt(sayi4);

        System.out.println(sayi5+sayi6); //sonuc 68 olucak cunku bir ust satirda parse
                                         //parse oldugu icin cevirme saglayacak

        System.out.println(Integer.MAX_VALUE);

        char chr='a';
        System.out.println("chr = "+chr);
        System.out.println(Character.toLowerCase(chr));//a
        System.out.println(Character.isUpperCase(chr));//False


        //Primitive bir data uzerinde islem yapmak istedigimizde
        //ihtiyacimiz olan metholadar Buyuk harf ile rapper class yaridm olacak sekilde olusurz

        Scanner scan=new Scanner(System.in);

        System.out.println("Bana bir karater yazarmisin");

        char girlenKarakter =  scan.next().charAt(0);

        System.out.println("girlenKarakter + 1 = " + (char)(girlenKarakter + 1));
        System.out.println("girlenKarakter + 2 = " + (char)(girlenKarakter + 2));
        System.out.println("girlenKarakter + 3 = " + (char)(girlenKarakter + 3));

        /// basina char ekelrsen char de sonra daki verir yoksa ascii karsiligni charda yazar
    }
}
