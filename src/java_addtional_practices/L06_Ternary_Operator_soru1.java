package java_addtional_practices;

import java.util.Scanner;

public class L06_Ternary_Operator_soru1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Bi sayi ver anam");

        int sayi=scan.nextInt();

        if (sayi % 5==0 ){

            System.out.println("Aferin annam bolunenn sayi buldun");


        } else {

            System.out.println("5' bolunmez annam :) ");
        }

    }
}
