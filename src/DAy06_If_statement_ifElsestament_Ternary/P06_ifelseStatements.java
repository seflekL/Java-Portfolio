package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;

public class P06_ifelseStatements {
    public static void main(String[] args) {
/*
Kullnicadan cinsiyetini ve yasini alin
kadin 60 yas ve izeri
erkek 65 yas uzeri olabilir
Cinseyet ve yasini dikate alarak "emekli olabilrisin
veya Emekli olmak icin ....Yil daha calisman gerekir" yazdirin
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Cinsiyetinizi giriniz(E/K)");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.print("Lutfen Yasinizi Giriniz ");

        int yas= scan.nextInt();

        if ((cinsiyet=='K') && yas>=60) {

            System.out.println("Emekli olabilrrsiniz");
        }

        if (cinsiyet=='K' && yas<60){
            System.out.println("Emekli olabilmek icin" +
                   " " + (60-yas)+ "Kadar calismaniz gerekmetedir");


        }

        if ((cinsiyet=='E') && yas>=60) {

            System.out.println("Emekli olabilrrsiniz");
        }

        if (cinsiyet=='E' && yas<60){
            System.out.println("Emekli olabilmek icin" +
                    (60-yas)+ "Kadar calismaniz gerekmetedir");


        }



    }
}
