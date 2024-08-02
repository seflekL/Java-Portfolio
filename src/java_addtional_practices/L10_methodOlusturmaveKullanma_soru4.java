package java_addtional_practices;

import java.util.Scanner;

public class L10_methodOlusturmaveKullanma_soru4 {

   // Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    //bolenleri sayisini bulup bize donduren bir method olusturun.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bölenleri bulunacak sayi giriniz:");
        int sayi= scan.nextInt();
        System.out.println(pozitifBolenleriBul(sayi));
    }

    private static int pozitifBolenleriBul(int sayi) {
        int sayac=0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }
        return sayac;
    }
}