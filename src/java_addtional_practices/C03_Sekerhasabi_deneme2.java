package java_addtional_practices;

import java.util.Scanner;

public class C03_Sekerhasabi_deneme2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //3- Kullaniciya ismini, soyismini
        //   gunde kac cay ictigini ve caya kac seker attigini sorun.
        //   1 yilda tukettigi seker miktarini hesaplayip, asagidaki sekilde yazdirin.
        //      (Bir seker 4 gr olarak degerlendirilir.)
        //	 Sayin Ali Yilmaz, ictiginiz cay ile birlikte yilda ….. Kg seker tuketiyorsunuz.

        System.out.println("Isminiz  nedir? ");

        String name= scan.nextLine();

        System.out.println("Soy isminiz nedir? ");

        String surName=scan.nextLine();

        System.out.println("Gunde kac cay icersininiz ve kac seker atar atarsiniz");

        int cayBardak= scan.nextInt();

        int caySeker=scan.nextInt();

        //Formul kismi

        int  yillikCayTutketimi = cayBardak * 365;

        double  yilikSekerTuketimi =  (cayBardak *caySeker* 365 * 0.004);

        System.out.println(

                "Sayin " + name + " " + surName + "  "+yillikCayTutketimi + " ictiginiz cay ile birlikte yilda "
                        + yilikSekerTuketimi+ " Kg seker tuketiyorsunuz.");




    }
}
