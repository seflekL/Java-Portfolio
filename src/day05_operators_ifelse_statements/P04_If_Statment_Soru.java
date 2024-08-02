package day05_operators_ifelse_statements;

import java.util.Scanner;

public class P04_If_Statment_Soru {
    public static void main(String[] args) {

        // Soru :Kullanicidan bir harf alin,
        //         harf ile baslayan bir ay varsa yazdirin.
        //         NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //         Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Bir harf giriniz");

        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf== 'O' || ilkHarf=='o'){

            System.out.println("O nun karlsigi ocak yazar");
        }

        if (ilkHarf=='S'|| ilkHarf=='s'){
            System.out.println("Subat olarak yaz");
        }

        if (ilkHarf=='M'|| ilkHarf=='m'){
            System.out.println("Mart veya Mayis olarak yaz");
        }
        if (ilkHarf=='N'|| ilkHarf=='n'){
            System.out.println("Nisan olarak ");
        }

        if ((ilkHarf=='H')|| (ilkHarf=='h')){
            System.out.println("Haziran olarak yazdir");

        }

        if (ilkHarf=='T'|| ilkHarf=='t'){
            System.out.println("Temmuz olarak yazar");

        }

        if (ilkHarf=='A'|| ilkHarf=='a'){
            System.out.println("Agust veya Aralik");
        }

        if (ilkHarf=='E'|| ilkHarf=='e'){
            System.out.println("Eylul veya Ekim");
        }

        if (ilkHarf=='K'|| ilkHarf=='k'){
            System.out.println("Kasim");
        } else {
            System.out.println("yanlis bisi girdin");
        }

     }
}
