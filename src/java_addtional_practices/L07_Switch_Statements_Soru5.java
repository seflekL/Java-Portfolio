package java_addtional_practices;

import java.util.Scanner;

public class L07_Switch_Statements_Soru5 {

    public static void main(String[] args) {

        // hafata icimi hafta sonu bulma


        Scanner scan= new Scanner(System.in);

        System.out.println("1 ile 7 arasi numrana girin size hafta icmi degilmi soyleyim");

        int sayi= scan.nextInt();

        switch (sayi){

            case 1 :
            case 2 :
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici anam"); break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu anam "); break;

            default:
                System.out.println("Yapma baska birseyler giriyorsun");
        }
    }
}
