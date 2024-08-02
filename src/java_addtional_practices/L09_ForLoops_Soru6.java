package java_addtional_practices;

import java.util.Scanner;

public class L09_ForLoops_Soru6 {
    public static void main(String[] args) {
/*
 Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
 */


    Scanner scan= new Scanner(System.in);
        System.out.println("Sayini gir anam");
    int sayi=scan.nextInt();

    int faktpriel=1;
    String aradakiler= "*";
 if (sayi> 20) {

     System.out.println("20 den kucuk sayi girmelisin ");
     {

         for (int i = sayi; i >= 1; i--) {

             faktpriel *= i;
             aradakiler += i;


             if (i != 1) {
                 aradakiler += " * ";
             }
         }
         System.out.print(sayi + "!=" + aradakiler + "= " + faktpriel);

     }
 }}
    }

