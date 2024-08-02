package day05_operators_ifelse_statements;

import java.util.Scanner;

public class P04_If_Statement_Class {

    public static void main(String[] args) {

        int a = 19;
        int b = 13;
        //If methodu sadece sart sagladinda yapicaktir. Eger sart yok ise yazmaz
        //false durumlarda if kullanilamaz
        if (a > b) {
            System.out.println("A sayisi B sayisindan buyuk");
        }

        //kullanicdan notunu isteyin 5 uzeri ise Tebrikler dersi gectiniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Ders notunuzu giriniz");
        double not = scan.nextDouble();
        if (not >= 50)
            System.out.println("Tebrikler sinifi gectiniz");
        {
        }

        if (not<50) {
            System.out.println("Kaldiniz yawrum");
        }






    }
}
