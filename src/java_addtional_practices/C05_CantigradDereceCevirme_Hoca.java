package java_addtional_practices;

import java.util.Scanner;

public class C05_CantigradDereceCevirme_Hoca {

    public static void main(String[] args) {


        // 7- Kullanicidan sicakligi Fahrenheit olarak alip celcius karsiligini yazdirin.
        //	  formul :  c = (f-32) * 5 / 9

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Fahrenheit olarak sicakligi giriniz...");

        double dereceFahr = scanner.nextDouble();


        double dereceCanti = (dereceFahr-32) * 5 / 9 ;



        System.out.println("sicaklik : " + dereceCanti + " C" );

    }
}
