package java_addtional_practices;

import java.util.Scanner;

public class S03_SicaklikDouble {

    public static void main(String[] args) {
        // Bir gün içinde alınan bir dizi sıcaklık göstergelerini giriniz.
        // "e" girildiğinde veri girişi sonlandırılsın.
        // Bu değerleri girdikten sonra, günün en sıcak ve soğuk değerlerini ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);

        double maxsicaklik=Double.MIN_VALUE;
        double minsicaklik=Double.MAX_VALUE;

        System.out.println("Sicaklik degerlerini giriniz. veri girisini sonlandirmak icin e`ye basiniz");

        while(true){
            String input= scan.nextLine();

            if (input.equals("e")){
                System.out.println("veri girisi sonlandiriliyor");
                break;
            } else if (!input.matches("-?\\d+(\\.\\d+)?")){
                System.out.println("gecersiz giris,lütfen bitirmek icin sadece e giriniz");
                continue;
                /*
                -?    negatif degerdeki sayilar icin
                \\d   0-9 arasi rakamlar icin
                +    basamak kazandirmak icin
                \\.\\d+  ondalikli kisim icin
                 */

            }
            double sicaklik=Double.parseDouble(input);//ondalik sayida nokta kullan
            if (sicaklik>maxsicaklik){
                maxsicaklik=sicaklik;
            }
            if (sicaklik<minsicaklik){
                minsicaklik=sicaklik;
            }
        }

        System.out.println("Günün en yüksek sicakligi:  "+maxsicaklik);
        System.out.println("Günün en düsük sicakligi:  "+ minsicaklik);

    }

}