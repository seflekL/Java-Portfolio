package java_addtional_practices;

import java.util.Scanner;

public class ATM {
    /*
             ATM EKRANI VE ISLEMLER
        -Kullanicidan giriş için kart numarasi ve şifresini isteyin,
           eger herhangi birini yanlis girerse tekrar girmesini isteyin.
        -Kart numarasini boşluk ile girerse, eger numara doğruysa kabul edin.
        -Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri (Menu listesi) ekrana yazdirin.
        -Menu listesinde;
               Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
               islemleri olacaktır.
        -Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez ve gönderilemez.
        -Para gönderme işleminde istenen iban TR ile baslamali ve toplam 10 karakter olmali,
            eger iban bu kriterlere uygun değilse menü ekranina geri donmelidir.
       - Sifre değiştirme işlemini yapmadan önce mevcut şifreyi teyit etmelidir.
         */

    static Scanner scan = new Scanner(System.in);
    static String kartno = "123456";
    static String sifre = "1234";
    static double bakiye=30000;

    public static void main(String[] args) {

        giris();
    }

    public static void giris() {
        System.out.println("\t\t\t****************GUVENBANK'A HOSGELDINIZ*****************\n" +
                "Guvenliginiz icin sifrenizi baskalari ile paylasmayiniz\n" +
                "***************************\n");

        System.out.println("Kart numaranizi giriniz");
        String kkartno = scan.nextLine();

        System.out.println("Sifrenizi giriniz");
        String ksifre = scan.nextLine();

        kkartno = kkartno.replaceAll("\\s", "");

        if (kkartno.equals(kartno) && ksifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("Hatali giris yaptiniz, tekrar deneyiniz");
            giris();
        }
    }

    public static void menu() {
        //Bakiye sorgulama, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis
        System.out.println("Yapmak istediginiz islemin numarasini tuslayiniz: \n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GÖNDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "Seciminiz:");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bakiyesorgulama();
                break;
            } case 2:{
                System.out.println("Yatiracaginiz miktari giriniz: ");
                double miktar=scan.nextDouble();
                parayatirma(miktar);
                break;
            } case 3:{
                System.out.println("Cekeginiz para miktarini giriniz: ");
                double miktar=scan.nextDouble();
                paracekme(miktar);
                break;
            } case 4:{
                paragonderme();
                break;
            } case 5:{
                sifredegistirme();
                break;
            } case 6:{
                System.out.println("Bankamizi tercih ettiginiz icin tesekkür ederiz...");
                System.exit(0);
            } default:{
                System.out.println("Menude olmayan bir islem secemesziniz, yanlis tusladiniz, tekrar deneyiniz");
                menu();
            }
        }

    }

    public static void sifredegistirme() {

    }

    public static void paragonderme() {
        scan.nextLine();
        System.out.println("IBAN No giriniz: ");
        String iban= scan.nextLine().toUpperCase().replaceAll("\\s","");
        if (iban.startsWith("TR")&&iban.length()==10){
            System.out.println("Miktari giriniz");
            double miktar= scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyesorgulama();
            }else {
                System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
                menu();
            }

        }else {
            System.out.println("Gecerli bir IBAN No giriniz, yanlis girdiniz");
            paragonderme();
        }
    }

    public static void paracekme(double miktar) {
        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyesorgulama();
        }else {
            System.out.println("Bakiyeniz yetersiz, tekrar deneyiniz");
            //double yenimiktar=scan.nextDouble();
            //paracekme(yenimiktar);
            paracekme(scan.nextDouble());
        }


    }

    public static void parayatirma(double miktar) {
        bakiye+=miktar;
        bakiyesorgulama();


    }

    public static void bakiyesorgulama() {
        System.out.println("Bakiyeniz: "+bakiye);
        menu();


    }
}