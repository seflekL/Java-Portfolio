package java_addtional_practices;

import java.util.Scanner;

public class L08_String_Manipulations_Soru1 {
    public static void main(String[] args) {

        /*
        Kullanicadan bir cunmle alin
        cumlede ev geciyorsa home sweet home sweet home yazdirin
        cumlede is geciyorsa calismak guzeldir
        =hicri icermiyorsa cok calisman lazinm


         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle girin");
        String cumle = scan.nextLine();
        String  strKucuk= cumle.toLowerCase();
        if (strKucuk.contains("ev")){
            System.out.println("home home sweet home");
        }
        else if (strKucuk.contains("is")){
            System.out.println("calismak guzeldir");
        }
        else if (strKucuk.contains("ev")&&strKucuk.contains("is")){
            System.out.println("hem ev lazim hem is");
        }
        else System.out.println("cok calisman lazim");
    }
}