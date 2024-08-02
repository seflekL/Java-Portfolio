package java_addtional_practices;

import java.util.Scanner;

public class C01_ustdegerhesaplama {

    // Kullanicadan poztif bir tam sayi
    //hesaplamk istedi us degerini alip soinucu yazdirin
    //sayi2,us2 use 2*2*2*2

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif tamn sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("Lutfen hesaplamak istedigniz us sayi icin pozitif  bir tamsayi giriniz");
        int us = scan.nextInt();

        int sonuc = 1 ;

        while (us >0){
            sonuc = sonuc*sayi;
            us--;
        }
        System.out.println("Islem sonuc"+ sonuc);
    }
}
