package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P05_switchStatement_ifyerine {
    public static void main(String[] args) {


        /*

         Kullnıcıya haftanın kaçıncı gününde olduğunu sorup
        O günün ismini yazdırın

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bugun haftanin kacinci gunundeyiz");

        int dayNumber = scan.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");

                break;
            case 2:
                System.out.println("Sali");

                break;
            case 3:
                System.out.println("Carsamaba");
                break;

            case 4:
                System.out.println("Persembe");

                break;

            case 5:
                System.out.println("Cuma");

                break;

            case 6:
                System.out.println("cumartesi");

                break;

            case 7:
                System.out.println("Pazar");

                break;

            default:
                System.out.println("Hafta da 7 gun vardir yanlis deger girdiniz");

            //long double float be boolean kullanilmaz
        }
    }
}
