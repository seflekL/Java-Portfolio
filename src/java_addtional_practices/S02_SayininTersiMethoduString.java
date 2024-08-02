package java_addtional_practices;

import java.util.Scanner;

public class S02_SayininTersiMethoduString {

    /*
  Soru: Kullanicidan pozitif bir tamsayi alip,
  sayinin tersini yazdiran bir method olusturunuz.
   */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        String sayi= scan.nextLine();

        System.out.println("Girdiginiz sayinin ters hali: "+tersiniBul(sayi));
    }

    static String tersiniBul(String sayi){
        //String stringSayi=Integer.toString(sayi);
        StringBuilder tersSayi=new StringBuilder();

        for (int i = sayi.length()-1; i >=0 ; i--) {
            tersSayi.append(sayi.charAt(i));
        }
        return tersSayi.toString();
    }
}