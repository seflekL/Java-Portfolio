package java_addtional_practices;

import java.util.Scanner;

public class C02_Casting_Class_Upper_Lower_deneme_01 {

    public static void main(String[] args) {

        //1- Kullanicidan bir harf isteyin, kullanici
        // kucuk harf verirse harfi buyuk harfe cevirin,
        //   Buyuk harf verirse kucuk harfe cevirin.
        //   Eger harf disinda farkli bir karakter girerse “Harf girmelisiniz” diyerek uyarin.
        //   Soruyu 3 farkli sekilde cozun
        //   - Casting kullanarak
        //   - Wrapper class hazir method’larla
        //   - String manipulasyon kullanarak

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz.");

        char harf=scan.next().charAt(0);

        if (Character.isLowerCase(harf)){

            harf=(Character.toUpperCase(harf));

            System.out.println("harf yeni deger = " + harf);

        } else if (Character.isUpperCase(harf)) {

            harf=(Character.toLowerCase(harf));

            System.out.println("harf yeni deger = " + harf);


        }else {

            System.out.println("Yanlis bir deger girdiniz");
        }


    }
}
