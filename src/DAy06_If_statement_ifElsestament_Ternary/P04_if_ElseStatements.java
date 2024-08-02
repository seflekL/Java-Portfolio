package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;

public class P04_if_ElseStatements {
    public static void main(String[] args) {
        /* Kullanicidan bir karakter girmesini isteyin
girilen karakterin bütük harf olup olmadığını kontrol edin

         */

        Scanner scan=new Scanner (System.in);

        System.out.println("Lutfen bir harf giriniz");

        char girilenharf=scan.next().charAt(0);

        if (girilenharf>='A' && girilenharf<='Z'){
            System.out.println("Girilen harf Buyuk harftir");
        }else{
            System.out.println("girilen harf kucuk harftir");

            //sorunun wroapper class ile cozumu

            if (Character.isUpperCase(girilenharf)){
                System.out.println("Girilen harf Buyuk harftir");
            }else{
                System.out.println("girilen harf kucuk harftir");

            }
        }
    }
}
