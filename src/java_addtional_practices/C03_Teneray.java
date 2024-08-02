package java_addtional_practices;

import java.util.Scanner;

public class C03_Teneray {
    public static void main(String[] args) {


     /*

        Kullanicidan iki tamsayi alin, kullaniciya sonucu tam sayi mi yoksa ondalikli olarak
        mi istedigini sorun,
         kullanicinin tercihine gore sayi/sayi2 sonucunu yazdirin
         */

    Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki tam sayi giriniz");

    int sayi1= scan.nextInt();
    int sayi2= scan.nextInt();

        System.out.println("Lutfen tercihhinizi girniz \n1 sonucu tam sayi olarak istiyorun " +
                " \n2 sonucu ondalik yazidirin");
    int tercih= scan.nextInt();

    //if else ile yaparsak
    //if else else if else if cumlerirn  bitmek zorunda degildir
        //ancak else ile biten if else cumleleri her durumda mutlaka calisirken
        //else ile biteyen if else cumleleri giridigimiz bazi degerler icin
        //sonuc uretmeyebilir

        if (tercih == 1){   //sonucu tam sayi sityour

            System.out.println(sayi1/2);

        } else if (tercih==2){ //sonucu odnalik olrak istiyor

            System.out.println((double)sayi1/sayi2);

        }
        /*
        Tenaray sadece iki durumdan olan kodlar icin tek satirdan olucak kullanaiblir daha
        karisik durumlar icin kullanilmasi tavsize edilmez
         */
        //tenray olarak iki ihitmal icin kuallanabiliriz
        //eger  tercih 1 ise ilk formul : degilse ikinci formul kolay ama sadece iki ihtimal olnalar
        System.out.println(tercih==1 ? sayi1/sayi2 : (double)sayi1/sayi2 );
}
}