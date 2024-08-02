package java_addtional_practices;

import java.util.Scanner;

public class Deneme3_caymaymay {

    public static void main(String[] args) {
/*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)

 */


        Scanner scan=new Scanner(System.in);

        System.out.println("Gunde kac cay yudumluyorsun");

        double cayYudum= scan.nextDouble();

        System.out.println("Yudumlarken kac seker atiyorsun");

        double sekerim=scan.nextDouble();

        double yillikHesap= (cayYudum*sekerim*2.77)*365/1000;
        double kirkyillikHesap= yillikHesap*40;

        if( sekerim== 0){

            System.out.println("oo sekersiz takiliyor dedem");
        } else {

            System.out.println("Yillik seker tuketiminiz " + yillikHesap + "kirkyillik ise  "+ kirkyillikHesap+"dir");
        }
    }
}
