package java_addtional_practices;

import java.util.Scanner;

public class L07_Switch_Statements_Soru1 {

    /*
    rakam ile  switch isle yazdirniz


     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi= scan.nextInt();

        switch (sayi) {

            case 0 :

                System.out.println("Sifir giriniz");

                break;
            case 1 :

                System.out.println("1 giridiniz");

                break;
            case 2 :
                System.out.println("2 giridiniz"); break;

            case 3 :
                System.out.println("3.girdiniz");break;
            case 4 :
                System.out.println("4 girdiniz"); break;
            case 5 :
                System.out.println("5 girdiniz"); break;
            case 6 :
                System.out.println("6 gridiniz"); break;
            case 7 :
                System.out.println("7 giridniz"); break;
            case 8 :
                System.out.println("8 girdiniz");break;

            default:
                System.out.println("0 ile 8 arasi bir sayi girmelsiniz ");
        }
    }
}
