package java_addtional_practices;

import java.util.Scanner;

public class L11_WhileLoop_Soru2 {
    static String harf= "";
    static int flag = 0;
    public static void main(String[] args) {

        /*
        Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;
        while (sayi>0) {
            rakamlarToplami += sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println("rakamlar toplami: "+rakamlarToplami);
    }
}

