package day04_wrapperClass_Char;

import java.util.Scanner;

public class P02_CastingChar {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner((System.in));

        System.out.println("Lutfen Bir Harf Giriniz " );

        char girilenHarf=scan.next().charAt(0); // charat tek harf almasini saglar

        System.out.println("girilenHarf = " + girilenHarf);
        System.out.println("girilenHarf = " +(char) girilenHarf); //k
        //onemsiz olur tekrar char yazmak zaten dger char olarak geciyor

        System.out.println(girilenHarf+1); //108
        System.out.println((char) (girilenHarf+1)); //

        System.out.println("Girilen harften sonraki 3 harf "); //k
        System.out.println((char)(girilenHarf +1)); //L
        System.out.println((char)(girilenHarf +2)); //m
        System.out.println((char)(girilenHarf +3)); //n










    }

}
