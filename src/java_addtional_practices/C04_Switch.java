package java_addtional_practices;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {

        //kunacidan 2 basakami bir sayi alipsayi yazi ile yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 basamakli bir sayi  giriniz");

        int sayi = scan.nextInt();

        int birlerBasamagindakiRakam = sayi % 10;
        int onlarBasmagindakiRakan = sayi / 10;

        //once onlar basagimdaki rakami yazdiriralm
        //0,1,2,3,4,5,6,7,8,9

        switch (onlarBasmagindakiRakan){

            case 1 :
                System.out.print("On");

                break;

            case 2 :
                System.out.print("Yirmi");

                break;

            case 3 :
                System.out.print("Otuz");

                break;

            case 4 :
                System.out.print("Kirk");

                break;


            case 5 :
                System.out.print("Elli");

                break;

            case 6 :
                System.out.print("Altimis");

                break;

            case 7 :
                System.out.print("Yetmis");

                break;

            case 8 :
                System.out.print("Seksen");

                break;

            case 9 :
                System.out.print("Doksan");

                break;
        }
//birler basmagi ciin
        switch (birlerBasamagindakiRakam){

            case 1 :
                System.out.print("bir");

                break;

            case 2 :
                System.out.print("iki");

                break;

            case 3 :
                System.out.print("uc");

                break;

            case 4 :
                System.out.print("dort");

                break;


            case 5 :
                System.out.print("bes");

                break;

            case 6 :
                System.out.print("alti");

                break;

            case 7 :
                System.out.print("yedi");

                break;

            case 8 :
                System.out.print("sekiz");

                break;

            case 9 :
                System.out.print("Dokuz");

                break;
        }


}
}
