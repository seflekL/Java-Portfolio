package java_addtional_practices;

import java.util.Scanner;

public class C01_DowhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicinin banka kart sifresi 1453 olarak kayitlidir.
         Kullanicidan kart sifresini isteyin, kullanici
         2 kez yanlis sifre girebilir, 3. kez yanlis sifre girerse
        ”sifreniz bloke edildi” yazdirin,
        ilk 3 defada dogru sifre girerse ”isleminize devam ediliyor” yazdirin
         */
        // deneme sayisi ve dogru sifre girilmesinie gore farkli akislar olusura biliriz

        Scanner scan= new Scanner(System.in);
        int gercekSifre=1453;
        int girilenSifre=0;
        int denemeSayisi=0;

        // 1. sifre dogru giriinceye kadar s isleme devam edelim eger deneme sayisi uc olursa break
        // yazalaim

       // while (girilenSifre!=gercekSifre){
//
       //     System.out.println("Lutfen sifrenizi giriniz");
       //     girilenSifre=scan.nextInt();
//
       //     denemeSayisi++; //
       //     // her sifre girdiginde birkez arttiracak
       //     if (denemeSayisi>=3 && girilenSifre !=gercekSifre){
       //         System.out.println("Sifreniz bloke oldu");
       //         break; // 3 kere yapdik daha fazla girmemeize gerek yok
//
       //     }
       // }
       // if ( girilenSifre ==gercekSifre){
       //     System.out.println("islemeniz devam ediliyor");

        ///2. yontem deneme sayisi 3 oluncaya kadar devam ederim eger sifre dogru olursa break derim
        //

        do{
            System.out.println("Lutfen sifrenizi giriniz");
            girilenSifre= scan.nextInt();
            denemeSayisi++;

            if (girilenSifre== gercekSifre ){

                System.out.println("Islemenize devam ediliyor");
                break;
            } else if (denemeSayisi== 3 ) {

                System.out.println("Sifreniz bloke edildi ");
                break;
            }


        }while(girilenSifre!=gercekSifre);
}}
//genelde do whilekullanilir