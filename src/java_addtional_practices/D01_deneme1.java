package java_addtional_practices;

import java.util.Scanner;

public class D01_deneme1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner((System.in));
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayo=scan.nextInt();

             tersinibul(sayo);
    }

    public static int tersinibul(int sayi) {
        int tersSayi=0;

        while(sayi!=0){
            int basmak = sayi % 10;
            tersSayi=tersSayi*10+basmak;
            sayi=sayi/10;

        }

        return tersSayi;
    }


}
