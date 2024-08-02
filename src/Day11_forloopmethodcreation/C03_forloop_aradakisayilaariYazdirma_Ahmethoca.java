package Day11_forloopmethodcreation;

import java.util.Scanner;

public class C03_forloop_aradakisayilaariYazdirma_Ahmethoca {
    public static void main(String[] args) {


        //kullanidan baslangic be bitis degeri ali
        //sinirlar dahil olamak uzere
        //baslangictan bitise kadar 7 ile bolunebilen sayilari yazdirin
        //bitis deger baslangictan kucuk ise hata versin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitisdeg = scan.nextInt();

        if (bitisdeg < baslangic) {

            System.out.println("Bitis degeri baslangic degerinden buyuk olmali");

        }else{

            for (int i = baslangic; i <=bitisdeg ; i++) {  //bits degerini girdik
                if (i % 7 ==0) {    //yedi ile bolunebilen olsun diye 7 dedik
                    System.out.print(i+" ");    // sornda yazdirdik
                }

            }
        }

    }
}
