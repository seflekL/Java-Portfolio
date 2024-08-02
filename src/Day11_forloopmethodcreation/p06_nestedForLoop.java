package Day11_forloopmethodcreation;

import java.util.Scanner;

public class p06_nestedForLoop {
    public static void main(String[] args) {

        /*
    Kullanicidan satir sayisini alip
    asagidaki sekli olusturun

    *
    * *
    * * *
    * * * *
    * * * * *

 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Satir sayisinini giriniz");

        int satir= scan.nextInt();

        for (int i = 1; i <=satir ; i++) {  //satirlai kontrol eder outerloop
            for (int j = 1; j <=i ; j++) {   //sutun sayisini inner loop
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
