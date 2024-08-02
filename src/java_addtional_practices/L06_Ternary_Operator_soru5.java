package java_addtional_practices;

import java.util.Scanner;

public class L06_Ternary_Operator_soru5 {
        /*
        Iki sayi olan buuyuk olani yazidirin
         */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(" Bir sayi giriniz");

        int sayi= scan.nextInt();

        System.out.println("Bir tane daha anam");

        int sayi2=scan.nextInt();

        if (sayi>sayi2){

            System.out.println(sayi);
        } else {

            System.out.println(sayi2);
        }
    }
}
