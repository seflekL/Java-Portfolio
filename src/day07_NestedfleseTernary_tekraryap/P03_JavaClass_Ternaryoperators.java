package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P03_JavaClass_Ternaryoperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz");
        int a = scan.nextInt();

        // if (a > 10) {
        //     a *= 2;
        //     System.out.println(a);

        // } else {
        //     a += 10;
        //     System.out.println(a);
        // }

        //turnery cozum

        a = a > 10 ? a * 2 : 10;
        //        ? if      : else olur yor
        System.out.println(a); //teksatirda coluyoor

        System.out.println("Bir sayi daha gir len");
        int b= scan.nextInt();
        System.out.println(b % 2== 0 ? "cift sayi" : "teksayi");


    }
}
