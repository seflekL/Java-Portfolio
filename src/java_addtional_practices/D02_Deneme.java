package java_addtional_practices;

import java.util.Random;
import java.util.Scanner;

public class D02_Deneme {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        Random  random= new Random();

        int kullaniciGiris=0;
        int bilgGirisi=0;

        int kullanici=0;
        int bilgisayar=0;

        do{

            System.out.println("Hosgeldiniz! Lütfen seciminizi sayi olarak belirtiniz. Tas icin 1, Kagit icin 2, Makas icin 3 tuslayiniz");
            kullaniciGiris= scan.nextInt();
            bilgGirisi=random.nextInt(3)+1;

            if (kullaniciGiris== 1&& bilgGirisi==2 ){
                System.out.println("Kagit Tasi sarar, bilgisyar +1");
                bilgisayar++;
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);

            }else if (kullaniciGiris==1 && bilgGirisi==3){
                System.out.println("Tas makasi kirar,kullanici +1");
                kullanici++;
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);

            }else if (kullanici==2 && bilgGirisi==1){
                System.out.println("Kagit tasi sarar , kullanici +1");
                kullanici++;
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);

            } else if (kullaniciGiris == 3 && bilgGirisi == 2) {
                System.out.println("makas kagidi keser,kullanici +1");
                kullanici++;
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);

            } else if (kullaniciGiris==3 & bilgGirisi==2) {
                System.out.println("mMakas kagidi keser, kullanic +1");
                kullanici++;
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);


            } else {
                System.out.println("Beraber kaldinizzz");
                System.out.println("Kullanici"+kullanici+"Bilgisayar"+ bilgisayar);

            }


        }while (kullanici!=5 && bilgisayar!=5);

            if (kullanici<bilgisayar){

                System.out.println("Java seni yendi");
            }  else {

                System.out.println("Tebrikler Kazandiniz");

            }

        }

    }
