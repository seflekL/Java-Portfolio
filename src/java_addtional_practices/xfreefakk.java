package java_addtional_practices;

import java.util.Scanner;

public class S08_xfreefakk {

    public static void main(String[] args) {


        //4- Kullanicidan bir sifre girmesini isteyin.
        //   Sifrenin asagidaki sartlari sagladigini kontrol edin
        //   ve saglamadigi her sarti ekranda yazdirin.
        //   Eger sifre tum sartlari sagliyorsa “Sifre basarili sekilde kaydedildi” yazdirin

        //	- sifre kucuk harf icermelidir
        //	- sifre buyuk harf icermelidir
        //	- sifre sayi icermelidir
        //	- sifre “!@#$%^&*<>,.?/\+_-=” sembollerinden en az bir tane icermelidir
        //	- sifre bosluk icermemelidir

        Scanner scan= new Scanner(System.in);

        System.out.println("Sifre gir ulen");
        String sifre=scan.nextLine();

        boolean sifreKucuk=false;
        boolean sifreBuyuk=false;
        boolean sifreSayi=false;
        boolean sifreOzel=false;
        boolean sifrebosluk=true;

        for (int i = 0; i <sifre.length() ; i++) {
            char elealininkarakter=sifre.charAt(i);

            if (Character.isLowerCase(elealininkarakter)) sifreKucuk=true;
            if (Character.isUpperCase(elealininkarakter)) sifreBuyuk=true;
            if (Character.isDigit(elealininkarakter)) sifreSayi=true;
            if (Character.isSpaceChar(elealininkarakter))  sifrebosluk=true;
            String ozelKarakte="!@#$%^&*<>,.?/\\+_-="; sifreOzel=false;

            if (sifreKucuk == false) {
                System.out.println("Sifre Kucuk harf icmermelidir");

        }   if (sifreBuyuk== false){
                System.out.println("Sifre buyuk harf icerneledir");
            } if (sifreSayi== false){
                System.out.println("Sifre sayi icermeledir");
                if (sifrebosluk==true){
                    System.out.println("Sifre bosluk icermemelidir");
                }
            }
            if (sifreBuyuk == true  &&
                    sifreKucuk == true  &&
                    sifreSayi==true &&
                    sifreOzel == true &&
                    sifrebosluk == false) {

                System.out.println("Sifreniz basarili olarak kaydedildi...");
            }

         }


    }
}
