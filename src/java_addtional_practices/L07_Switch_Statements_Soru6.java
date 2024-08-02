package java_addtional_practices;

import java.util.Scanner;

public class L07_Switch_Statements_Soru6 {

    /*
    Ay numarasını giriniz mevsimi soyleyi sana
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println(" Ay numarasini giriniz ");
         int ay= scan.nextInt();

         switch (ay) {

             case 1 :
             case 12:
             case 11:
             case 2 :
                 System.out.println("kis"); break;

             case 3:
             case 4:
             case 5:
                 System.out.println("Ilk bahar"); break;

             case 6 :
             case 7 :
             case 8:
                 System.out.println("Yaz"); break;
             case 9 :
             case 10:
                 System.out.println("Son bahar"); break;

             default :
                 System.out.println("  olum kac war asaniyorsun 1 ile 12 arasi bir sayi gir");

         }
    }
}
