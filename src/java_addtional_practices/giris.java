package java_addtional_practices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class giris extends islemler  {
     Scanner scan=new Scanner(System.in);
    void menu () {
        urun urun1 = new urun("PORTAKALI KURABIYE", 10);
        urun urun2 = new urun("UZUMLU KURABIYE", 15);
        urun urun3 = new urun("BADEMLI KURABIYE", 20);
        urun urun4 = new urun("CIKOLATALI KURABIYE", 10);
        urun urun5 = new urun("DIYET KURABIYE", 17);

        urunler.put(1001, urun1);
        urunler.put(1002, urun2);
        urunler.put(1003, urun3);
        urunler.put(1004, urun4);
        urunler.put(1005, urun5);


        System.out.println("*************************************Kupkuru Dukkanima Hosgeldiniz*************************************");
        System.out.println("Yapmek istediginiz islemin numarini yazini\n" +
                "1. URUN LISTELEME\n" +
                "2. ALISVERIS\n" +
                "3. SEPETI GORUNTULEME\n" +
                "4. ODEME\n" +
                "5. CIKIS ICIN Q`YA BASINIZ\n" + "SECIMINIZ");

        int secim = scan.nextInt();

        try {
            switch (secim) {

                case 1: {
                    urunlisteleme(urunler);
                    menu();
                }
                case 2: {
                    alisveris();
                    menu();
                }
                case 3: {
                sepetGoruntuleme();
                menu();
                }
                case 4: {
                odeme();
                menu();
                }

                default: {
                    System.out.println("Hatali islem yaptiniz");
                    menu();

                }
            }


        } catch (InputMismatchException e) {
            if (scan.next().equalsIgnoreCase("q")) {
                System.out.println("Bizi tercih ettigniz icin tesekkur ederiz");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yaptiniz, Tekrar yine bekleriz");
                menu();
            }
        }

    }}
