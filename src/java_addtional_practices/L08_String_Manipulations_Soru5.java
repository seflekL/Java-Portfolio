package java_addtional_practices;

import java.util.Scanner;

public class L08_String_Manipulations_Soru5 {

/*
Kullanicidan isim ve soyismini ayri ayri alin.- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin

 */
public static void main(String[] args) {

    Scanner  scan= new Scanner(System.in);

    System.out.println("Isminizi giriniz");

    String isim=scan.nextLine();

    System.out.println("soyd adiniz");

    String soyad=scan.nextLine();

    if (isim.length()>soyad.length()){

        System.out.println(Character.toUpperCase(isim.charAt(0))+isim.substring(1));
    } else if (isim.length()<soyad.length()) {

        System.out.println(Character.toLowerCase(soyad.charAt(0))+soyad.substring(1).toUpperCase());


    } else{

        System.out.println("Farkli seyeer girdiniz");
    }


}

}
