package java_addtional_practices;

import java.util.Scanner;

public class L12_dowhileLoop_soru2 {
/*
- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
kontrol edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir.
 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String sifre="";

        do {
            System.out.print("Şifrenizi girin: ");
            sifre = scan.nextLine();

            if (sifre.length() < 8) {
                System.out.println("Şifre en az 8 karakter olmalıdır.");
            } else if (!sifre.matches(".*[a-z].*")) {
                System.out.println("Şifre küçük harf içermelidir.");
            } else if (!sifre.matches(".*[A-Z].*")) {
                System.out.println("Şifre büyük harf içermelidir.");
            } else if (!sifre.matches(".*[!@#$%^&*()].*")) {
                System.out.println("Şifre özel karakter içermelidir.");
            } else {
                System.out.println("Şifreniz Kabul edilmiştir.");
                break;
            }
        } while (true);

        scan.close();
    }
}