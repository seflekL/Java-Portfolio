package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P06_switchstatement {
    public static void main(String[] args) {

        // Kullanicidan ISTQB kisaltmasindan harfin anlamini
        // ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
// I : International S : Software T : Testing Q : Qualifications B: Board


        Scanner scan=new Scanner(System.in);

        System.out.println("ISTQB Kelimesinde anlamadini merak ettiginiz harfi yaziniz");

        char harf=scan.next().charAt(0); //sayio olsa int kullanicaktik

        switch (harf){

            case  'I' :
            case 'i'  :
                System.out.println("International");
                break;

            case 'S':
            case's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qaulification");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Girdigniz harf ISTQB yer almamaktadir");






        }
    }
}
