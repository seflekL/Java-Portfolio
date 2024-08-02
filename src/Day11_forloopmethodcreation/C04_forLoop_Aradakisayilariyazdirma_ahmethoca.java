package Day11_forloopmethodcreation;

import java.util.Scanner;

public class C04_forLoop_Aradakisayilariyazdirma_ahmethoca {

    public static void main(String[] args) {


        //kullanidan baslangic be bitis degeri ali
        //sinirlar dahil olamak uzere
        //baslangictan bitise kadar 9 ile bolunebilen sayilari yazdirin
        //bitis deger baslangictan kucuk olsa da kod calismalidir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitisdeg = scan.nextInt();

        if (baslangic< bitisdeg){
            for (int i = baslangic; i <=bitisdeg ; i++) {
                if (i % 9== 0){
                    System.out.println(i+ " ");
                }

            }

        }else{  //baslangic >= bitis

            for (int i = baslangic; i >=bitisdeg ; i++) {
                if (i % 9== 0){
                    System.out.println(i+ " ");

            }

        }


    }
}

}

