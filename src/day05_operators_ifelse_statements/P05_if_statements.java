package day05_operators_ifelse_statements;

import java.util.Scanner;

public class P05_if_statements {

    public static void main(String[] args) {

        //Soru :Kullanicidan bir harf alin,
        //         harf ile baslayan bir ay varsa yazdirin.
        //         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //         Kullanici o veya O yazdiginda output Ocak olsun.


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir harf girniz");

        char ilkharf= scan.nextLine().charAt(0);

        if (ilkharf=='O'|| ilkharf== 'o') {
            System.out.println("Ocak");

        }

        if (ilkharf=='S'|| ilkharf=='s'){
            System.out.println("Subat");
        }
        if (ilkharf=='M' || ilkharf=='m'){
            System.out.println("Mart");

        }

        if (ilkharf=='N' || ilkharf=='n'){
            System.out.println("");



    }



}}

