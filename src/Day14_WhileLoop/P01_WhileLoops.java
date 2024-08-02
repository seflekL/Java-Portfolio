package Day14_WhileLoop;

import java.util.Scanner;

public class P01_WhileLoops {

    public static void main(String[] args) {

/*
While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Kullanicadan bir sayi alin ve rakamlari toplayin");

        int sayi= scan.nextInt();
        int rakamlarToplam=0;

       while(sayi>0){
           rakamlarToplam+=sayi%10;
           sayi/=10;

       }
        System.out.println("Girilen sayinin rakamlar Toplami "+ rakamlarToplam);
    }
}
