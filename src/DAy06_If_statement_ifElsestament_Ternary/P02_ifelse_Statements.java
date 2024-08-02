package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;

public class P02_ifelse_Statements {
    public static void main(String[] args) {
        //Girilen sayi cift ise "Cift sayi yazdirsin" degilse " Tek sayi yazdirsin"

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir Sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi%2==0) {
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek sayi");
        }
    }
}
