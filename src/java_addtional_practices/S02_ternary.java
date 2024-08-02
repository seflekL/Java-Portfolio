package java_addtional_practices;

import java.util.Scanner;

public class S02_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir sayi al
        //0 dan büyükse ve esitse 10 dan kucuk olup olmadigini kontrol et
        //10 dan kücükse ekrana "rakam" yazdir, degilse "pozitif sayi" yazdir
        //sayi 0 dan kücük ise "nagatif sayi" yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();


        System.out.println(sayi<0 ? "negatif sayi" : sayi<=9 ? "rakam" : "pozitif sayi");
    }
}