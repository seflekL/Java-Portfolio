package DAy06_If_statement_ifElsestament_Ternary;

import java.util.Scanner;
//Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin.
public class P01_odev_olucak_1_3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfenen ucgenin kenar uzunlarini giriniz");

        System.out.println("ilk kenarani giriniz");
        int kenar1=scan.nextInt();

        System.out.println("Ikinci kenari giriniz");
        int kenar2= scan.nextInt();

        System.out.println("Ucuncu kenari giriniz");
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3){

            System.out.println("Kenar olculerini girdiginiz ucgen bir eskenar ucgendir10");
        }



    }
}
