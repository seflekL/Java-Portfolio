package Day11_forloopmethodcreation;

import java.util.Scanner;

public class C01_Faktoryel_ahmethoca {
    public static void main(String[] args) {
         //Kullnicadan 14 den kucuk bir sayi alip 
        /// sayinin faktoryel degerini hesaplayin
        //5!= 5 * 4 * 3 *2 * 1 ==>

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tam  sayi giriniz");
        
        int sayi= scan.nextInt();
        int faktoryel=1;//sifir olamaz  her carpismada 0 cikar
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;
            //System.out.print(faktoryel+ " "); //icne yzarsan hepsini gosterr
        }
        System.out.println(faktoryel);
    }
}
