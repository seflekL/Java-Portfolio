package java_addtional_practices;

import java.util.Scanner;

public class S01_Kahve_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz?" + "\n1-Türk kahvesi" + "\n2-Filtre Kahve" + "\n3-Espresso");
        System.out.println("Icmek istediginiz kahvenin sadece adini yaziniz");
        String hangiKahve;

        while (true) {
            hangiKahve = scan.nextLine();

            if (hangiKahve.equalsIgnoreCase("Turk Kahvesi") || hangiKahve.equalsIgnoreCase("Türk kahvesi")) {
                System.out.println(hangiKahve + " hazirlaniyor...");
                break;
            } else if (hangiKahve.equalsIgnoreCase("Filtre kahve")) {
                System.out.println(hangiKahve + " hazirlaniyor...");
                break;
            } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
                System.out.println(hangiKahve + " hazirlaniyor");
                break;

            } else {
                System.out.println("Hatalı giris yaptınız, bastan baslayiniz");

            }
        }
        String sut;
        while (true) {
            System.out.println("Sut istermisiniz, Evet veya Hayır olarak cevaplayınız");
            sut = scan.nextLine();
            if (sut.equalsIgnoreCase("Evet")) {
                System.out.println("Sut ekleniyor.");
                break;
            } else if (sut.equalsIgnoreCase("Hayir")) {
                System.out.println("Süt eklenmiyor");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz, yeniden baslayiniz");

            }
        }
        while (true) {
            System.out.println("Seker ister misiniz? Evet veya Hayır olarak cevaplayınız");
            String seker = scan.nextLine();
            if (seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kaç şeker olsun?");
                int kacSeker = scan.nextInt();
                System.out.println(kacSeker + "  seker ekleniyor");

                break;
            } else if (seker.equalsIgnoreCase("Hayir")) {
                System.out.println("Seker eklenmiyor, Enter'a basiniz");
                break;
            } else {
                System.out.println(" Hatali giris yaptiniz, evet veya hayir disinda cevaplar kabul edilmemektedir");

            }
        }

        String boyut;
        while (true) {
            System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :");
            boyut = scan.nextLine();
            if (boyut.equalsIgnoreCase("buyuk boy") || boyut.equalsIgnoreCase("büyük boy")) {
                System.out.println(boyut + "kahveniz hazirlaniyor");
                break;
            } else if (boyut.equalsIgnoreCase("orta boy")) {
                System.out.println(boyut + "kahveniz hazirlaniyor");
                break;
            } else if (boyut.equalsIgnoreCase("kucuk boy") || boyut.equalsIgnoreCase("kücük boy")) {
                System.out.println(boyut + "kahveniz hazirlaniyor");
                break;
            } else {
                System.out.println("Hatali giris yaptiniz");


            }
        }

        System.out.println(hangiKahve + "  " + boyut + "  " + " boy hazırdır. Afiyet olsun !!! ");

    }

}
