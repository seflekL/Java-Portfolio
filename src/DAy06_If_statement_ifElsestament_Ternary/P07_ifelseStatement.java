package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;

public class P07_ifelseStatement {
    public static void main(String[] args) {

               /*
Kullnicadan cinsiyetini ve yasini alin
kadin 60 yas ve izeri
erkek 65 yas uzeri olabilir
Cinseyet ve yasini dikate alarak "emekli olabilrisin
veya Emekli olmak icin ....Yil daha calisman gerekir" yazdirin
 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Cinsiyetinizi giriniz(E/K) : ");
        char cinsiyet = scan.nextLine().toUpperCase().charAt(0);
        System.out.print("Lütfen Yaşınızı giriniz: ");
        int yas = scan.nextInt();

        if (cinsiyet == 'K') {
            if (yas >= 60) {
                System.out.println("Emekli Olabilirsiniz");
            } else {
                System.out.println("Emekli olabilmek için " + (60 - yas) + " yıl çalımalısınız");
            }

        } else {
            if (cinsiyet == 'E' && yas >= 65) {
                System.out.println("Emekli olabilirsiniz");
            }
            if (cinsiyet == 'E' && yas < 65) {
                System.out.println("Emekli olabilmek için " + (65 - yas) + " yıl çalımalısınız");
            } else {
                System.out.println("Yanlış değer girdiniz: ");
            }


        }


    }
}
