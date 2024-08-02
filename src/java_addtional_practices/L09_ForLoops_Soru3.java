package java_addtional_practices;

import java.util.Scanner;

public class L09_ForLoops_Soru3 {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi girniz");
        int baslangic= scan.nextInt();
        System.out.println("bitis degeri giriniz");
        int bitis=scan.nextInt();
        int toplam=0;

        if (bitis<baslangic){

            System.out.println("Baslangi degeri  buyk olmaldir");


        }else {

            for (int i = baslangic; i <= bitis ; i++) {

                toplam+=i;


                System.out.println("i="+toplam);
            }
        }
    }
}
