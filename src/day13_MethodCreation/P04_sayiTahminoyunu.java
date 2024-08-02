package day13_MethodCreation;

import java.util.Random;
import java.util.Scanner;

public class P04_sayiTahminoyunu {
    public static void main(String[] args) {

        int a = 128;

        Random random = new Random();
        int sayi = random.nextInt(100);// yuze kadar sayi  secer


        Scanner scan = new Scanner(System.in);

        System.out.println("Aklimdan 100'den Kucuk bir sayi tuttum hadi tahmin et bakalim");


        boolean dogruMu = false;

        while (!dogruMu) {
            int tahmin = scan.nextInt();
            if (tahmin > sayi) {
                System.out.println("cok Soyledin azalt");

            } else if (tahmin < sayi) {
                System.out.println("Az soyledin arttir");
            } else {
                System.out.print("Tebrikler dogru bildiniz aklimdaki sayi" + " " + sayi);
                dogruMu = true; //sistemin durmasi icin
            }
        }

    }
}
