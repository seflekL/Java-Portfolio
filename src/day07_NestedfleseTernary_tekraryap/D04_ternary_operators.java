package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class D04_ternary_operators {
    public static void main(String[] args) {


        /*
Kullanicidan notunu alin
50 veya daha buyukse "Sinifi Gectin",
50’den kucukse "Maalesef kaldin" yazdirin.
 */


        Scanner scan=new Scanner(System.in);

        System.out.println("Notunuzu giriniz");

        double dersNot= scan.nextDouble();

        System.out.println(dersNot>=50 ? "Tebrikler Sinifi gectiniz":
                "Malasef Kaldiniz"); //soru isareti varsa muhakak : ihitmal yazdir
        //?+: hep beraber


        System.out.println(" Iki adet Sayi Girinip enter basiniz");

        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(sayi1>sayi2 ? sayi2 : sayi1 );  //sayi1 bir ikiden buyukse





    }
}
