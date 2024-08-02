package day03_ScanerWrapperWidenning;

import java.util.Scanner;

public class P04_Scanner_odev7_soru {
//Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);

    System.out.print("Lutfen A Tam Sayisini Giriniz");
    int A= scan.nextInt();
    System.out.print("Lutfen B Tam Sayisini Giriniz");
    int B= scan.nextInt();
    System.out.println(A);
    System.out.println(B);
    System.out.println("----------taaaada---------");
    //A=10 B=25 girilmis olsun
    // System.out.print("Lutfen A  diyince 25
    // System.out.print("Lutfen b  diyince 10 yazsin istiyoruz

    int C=0;

    C=A;//C ye a A icin degeri atadik
    //A=10 B=25 C=10
    A=B; // A=25 B=25 C=10
    B=C; // A=25 B=10 C=10
    System.out.println(A);
    System.out.println(B);

}
}
