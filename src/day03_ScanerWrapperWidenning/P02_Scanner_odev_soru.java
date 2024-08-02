package day03_ScanerWrapperWidenning;

import java.util.Scanner;

public class P02_Scanner_odev_soru {
    /*
   - Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir
    */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.print("Adiniz ");
        String name= scan.nextLine();

        System.out.print("Soyadiniz");
        String surname= scan.nextLine();

        System.out.print("Yasiniz");
        int age=scan.nextInt();

       System.out.println("isminiz = " + name);
       System.out.println("Soyisminiz = " + surname);
       System.out.println("Yasiniz = " + age);
       System.out.println("Tebrikler Basariyla ile tamamladiniz");







    }
}
