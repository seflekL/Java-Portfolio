package java_addtional_practices;

import java.util.Scanner;

public class L08_String_Manipulations_Soru2 {

    public static void main(String[] args) {
/*
 Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
 input1 : “15.30 €” , input2 : “11.40 €”
 output : 26.70 €
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ilk fiyati giriniz");
        String fiyat= scan.nextLine();

        System.out.println("ikinci fiyati giriniz");
        String fiyatIki=scan.nextLine();

        System.out.println("Ucuncu fiyati giriniz");
        String fiyatUc=scan.nextLine();

        double dDeger=Double.parseDouble(fiyat);
        double dDeger2=Double.parseDouble(fiyatIki);
        double dDeger3=Double.parseDouble(fiyatUc);

        double toplam=dDeger+dDeger2+dDeger3;

        System.out.println("Toplami "+toplam+"€.");






    }
}
