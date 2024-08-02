package day05_operators_ifelse_statements;

import java.util.Scanner;

public class P07_odev_sorusu {
    public static void main(String[] args) {


    //Soru:

    //Kullanicadan yasini alip yasi 18 ve uzeri ise "Eliyet basvurunuz kabul edilmistir" deyin
    //"Yasi 18 den kuck  ise "Ehliyet Basvurunuz red edilmistir ......yil sonra basvura bilrisiniz.
    //yerie kac yil varsa yazdirinm not bagimsiz ifler kullanin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        if (yas>=18){

            System.out.println("Tebrikler Basvuru yapabilirsiniz");


        }
        if (yas<18){
            System.out.println("Basvuru Red Edilmisir"+" " + (18-yas)+ " " + "Yil Sonra Basvuru Yapabilirsiniz" );

        }










    }
}



