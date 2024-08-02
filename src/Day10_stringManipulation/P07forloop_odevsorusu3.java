package Day10_stringManipulation;

import java.util.Scanner;

public class P07forloop_odevsorusu3 {
    public static void main(String[] args) {

        /*
         Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse,
         uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Baslangic Degeri Giriniz");
        int baslangicDeg= scan.nextInt();
        System.out.print("Bitis Degeri Giriniz");
        int bitisDeg= scan.nextInt();

        int toplam=0;

        if (bitisDeg<baslangicDeg){
            System.out.println("Baslangic degeri bitis degerinden kucuk olamaz");


        } else {

            for (int i = baslangicDeg; i <=bitisDeg ; i++) {
                toplam+=i;


            }
            System.out.println(toplam);
        }

    }
}
