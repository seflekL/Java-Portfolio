package java_addtional_practices;

import java.util.Scanner;

public class C03_String_manipulation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lufen bir harf giriniz");

        String girilenMetin = scan.nextLine();

        //oncelikle kuulanici 1 harf mi girmis kontrol edip
        //bir harften fazla ise uyari yazdirabiliriz

        if (girilenMetin.length() != 1) { //girilen metin  tek bir harf degildir

            System.out.println("Sizden sadece bir harf girminiz istedim...");


        } else if (Character.isUpperCase(girilenMetin.charAt(0))) { //girilen bir tek buyuk harf mi  oyles  alt satir da kucuge cevirip
            girilenMetin = girilenMetin.toLowerCase();

            System.out.println("Girdininiz harfin yeni hali :" + girilenMetin);

        } else if (Character.isLowerCase(girilenMetin.charAt(0))) {
            girilenMetin = girilenMetin.toUpperCase();

            System.out.println("Metinin yeni hali"+ girilenMetin);

        }else{

            System.out.println("3.ihtimal olarak ihtimal bittigi icin harf gilrmelsiniz yaziyoruz son else ile");
        }


    }
}
