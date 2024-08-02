package Day14_WhileLoop;

import java.util.Scanner;

public class C02_sayininRakamtoplaminibulma {

    public static void main(String[] args) {
        //soru 2-While kullanarak kullanicadan alinin sayinin toplamani bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen rakamlari toplanacak pozitif tamsayi giriniz");
        int sayi=scan.nextInt();

        //diyelim 1721 girdi

        int ensonRakam=  0;
        int rakamlarToplami= 0;
        int verilenSayi=sayi;
        while (verilenSayi>0){

            ensonRakam =verilenSayi% 10;
            rakamlarToplami+=ensonRakam;
            verilenSayi /=10;
        }

        System.out.println("Verilen "+sayi+"sayininrakamlar toplami "+rakamlarToplami);




    }
}
