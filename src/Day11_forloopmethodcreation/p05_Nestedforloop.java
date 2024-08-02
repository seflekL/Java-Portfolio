package Day11_forloopmethodcreation;

import java.util.Scanner;

public class p05_Nestedforloop {
    public static void main(String[] args) {


        /*
        Kullanicdan satir ve sutun sayisini alip

        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *

        seklini yazdirinin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Satir Sayisi: ");
        int satir=scan.nextInt();

        System.out.println("Sutun Sayisi: ");
        int sutun=scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <sutun ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
