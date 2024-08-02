package java_addtional_practices;

import java.util.Scanner;

public class C05_asalmi {
    public static void main(String[] args) {


        //Verilen bir sayinin asal olup olmadiigni yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutffen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();
        // while comezk icin once boolean olusur
        boolean asalmi = true;

        int bolunecekSayi=2;

        while (bolunecekSayi<sayi){

            if (sayi % bolunecekSayi == 0 ){ //girlen sayi tam sayiya bolunuyorsa
                asalmi= false;


            } //hocadan al

            bolunecekSayi++;
            if (asalmi == true) { // girilen sayi asal mi

                System.out.println("Girlen sayi asal mi");
            } else {
                System.out.println("Girilen sayi asal degil ");
            }
        }

        //sayinin asal olup oladigini nasil yazidiraziblirz

    }
}
