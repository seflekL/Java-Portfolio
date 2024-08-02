package java_addtional_practices;

import java.util.Scanner;

public class L06_Ternary_Operator_soru2 {

    public static void main(String[] args) {
        /*
        Kullanicdan bir ucegenin 3 kenar uzunlgunu alin ucgen eskenar ise " Eskenar ucgen "
        yazdirin degilse esknakar degil


         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Uc adet sayi gir anam ");

        int sayi=scan.nextInt();
        System.out.println("ikinci sayi anam");
        int sayi2=scan.nextInt();
        System.out.println("ucuncu sayi anam");
        int sayi3=scan.nextInt();




        if (sayi==sayi2 && sayi2== sayi3){

            System.out.println("Afferin es kenar anam ");


        } else{

            System.out.println("Eskenar degil anam");

        }
    }

}
