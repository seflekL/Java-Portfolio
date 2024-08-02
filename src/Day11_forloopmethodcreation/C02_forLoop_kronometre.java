package Day11_forloopmethodcreation;

import java.util.Scanner;

public class C02_forLoop_kronometre {
    public static void main(String[] args) {
        
        //bir krometre yapin
        //kullanidan aldiginiz pozitif sayidan 
        //1e kadar tum sayidirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi giriniz");
        
        int sayi = scan.nextInt();

        for (int i = sayi; i >= 1 ; i--) {

            System.out.print(i+" ");
            
        }
    }
}
