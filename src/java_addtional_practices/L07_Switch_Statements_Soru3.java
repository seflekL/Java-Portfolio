package java_addtional_practices;

import java.util.Scanner;



public class L07_Switch_Statements_Soru3 {
    static int ayINT;

    public static void main(String[] args) {

        // aylari yazdirdiralrainm

        Scanner scan= new Scanner (System.in);

        System.out.println("Lutfen bir 1 - 12 kadar yazdirmak istedigniz ayin rakamini giriniz");

           int ay= scan.nextInt();



         switch (ay){

            case 1 :
                System.out.println("ocak"); break;
            case 2 :
                System.out.println("subat");break;
            case 3 :
                System.out.println("Mart");break;
            case 4 :
                System.out.println("Nisan");break;
            case 5 :
                System.out.println("Mayis"); break;
            case 6  :
                System.out.println("Haziran"); break;
            case 7 :
                System.out.println("Temmuz");
            case 8 :
                System.out.println("Agust"); break;
            case 9 :
                System.out.println("Eylul"); break;

            case 10 :
                System.out.println("Ekim"); break;
            case 11 :
                System.out.println("Kasim"); break;
            case 12 :
                System.out.println("Aralik"); break;

            default:
                System.out.println("1-12 arasi rakam gireceksin anam");

        }
    }
}
