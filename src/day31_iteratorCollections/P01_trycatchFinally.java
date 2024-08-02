package day31_iteratorCollections;

import java.util.Scanner;

public class P01_trycatchFinally {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("iki adet tam sayi girniz");

        System.out.print("Birinci sayi");
        int sayi1= scan.nextInt();
        System.out.print("Ikinci sayi");
        int sayi2=scan.nextInt();

        try {
            System.out.println("iki sayinin bolumu"+sayi1/sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Ikinci sayi sifir olaamaz");
        } finally {
            System.out.println("finally block calisti");
        }

    }
}
