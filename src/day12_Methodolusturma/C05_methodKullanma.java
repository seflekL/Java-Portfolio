package day12_Methodolusturma;

import java.util.Scanner;

public class C05_methodKullanma {

    public static void main(String[] args) {
        //kullanidan bir metin alin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin girin ");
        String metin= scan.nextLine();
        //kullanidan girdigi metni tersten yazdirin

       // C03_methodOlusturma_terstyazdirma.terstenYazim(metin);


        //kullanicinin girdigi metinin palindorme olup olmaidigina bakin

        C04_palindrome_method.isPalindrome(metin);

    }



}
