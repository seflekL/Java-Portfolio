package java_addtional_practices;

import java.util.Scanner;

public class C03_Sekerhasabi {
    public static void main(String[] args) {

//3- Kullaniciya ismini, soyismini
        //   gunde kac cay ictigini ve caya kac seker attigini sorun.
        //   1 yilda tukettigi seker miktarini hesaplayip, asagidaki sekilde yazdirin.
        //      (Bir seker 4 gr olarak degerlendirilir.)
        //	 Sayin Ali Yilmaz, ictiginiz cay ile birlikte yilda ….. Kg seker tuketiyorsunuz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz...");

        String soyisim = scan.nextLine();

        System.out.println("Gunde kac cay iciyorsunuz ve kac seker atiyorsunuz");

        int caySayisi = scan.nextInt();



        double sekerSayisi= scan.nextDouble();

        //once hesabi yapalim

        double yillikSekerMiktari = caySayisi * sekerSayisi * 365 * 0.004;
        int yillikCaymiktari = caySayisi * 365 ;




        System.out.println(

                "Sayin " + isim + " " + soyisim + "  "+yillikCaymiktari + " ictiginiz cay ile birlikte yilda "
                        + yillikSekerMiktari + " Kg seker tuketiyorsunuz."
        );









    }
}
