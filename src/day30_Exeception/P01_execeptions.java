package day30_Exeception;

import java.util.Scanner;

public class P01_execeptions {
    public static void main(String[] args) {

        /*
Kullanicdan  iki adet tam sayi alip bu tamsalarin bolumnun sonucunu yazdirin
 */
        int sayi1=0;
        int sayi2=0;
        boolean problemvarmi=true;
        while (problemvarmi){ // problem varmi = true oldugu muddetce donndur diyoruz
        try {
            Scanner scan=new Scanner(System.in);

            System.out.print("Lutfen bolme isilmeni kullanicak iki tam sayi giriniz ");

            System.out.println("Birinci tam sayi ");

            sayi1=scan.nextInt();
            System.out.print("Ikinci tam sayi giriniz ");
            sayi2= scan.nextInt();
            problemvarmi=false;
        } catch (Exception e) {
            System.out.println("Dostum yapma bana numara tam sayi diyorum");
        }
        }


        if (sayi2==0){

            System.out.println("Ikinci sayi sifir olamaz ");
        } else   {
            System.out.println("Birinci sayinin ikinci sayiya bolumu "+ sayi1/sayi2);



        }
    }
}
