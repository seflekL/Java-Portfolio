package java_addtional_practices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class D04_deneme1 {
    public static void main(String[] args) {
       // - Ogretmenden istedigi kadar not alip,
        //   ogretmen Q’ya bastiginda
        //   - girilen not sayisini,
        //   - girilen notlarin ortalamasini
        //   - ve ortalama uzerindeki ogrenci sayisini yazdiran bir method olusturun
notdegerlendir();
    }

    public static void notdegerlendir(){

        List<Double>notlistesi= new ArrayList<>();

        Scanner scan=new Scanner(System.in);

        double not=0;

        String notolmayanlarGiris="";

        do {
            System.out.println("Lutfen Ogrenci notunu giriniz bitirmek icin Q basiniz");

            try {
                not=scan.nextDouble();

                notlistesi.add(not);
            } catch (InputMismatchException e) {
                notolmayanlarGiris=scan.nextLine();
                if(!notolmayanlarGiris.equalsIgnoreCase("q")){
                    System.out.println("Yanlis giris yaptiniz");
                }
                //try bolumunde  neextdouble () kod bu sagtiragelicek//

            }

        }while(!notolmayanlarGiris.equalsIgnoreCase("q"));

        System.out.println(notlistesi.size()+"adet not girdiniz");
        double toplamflag=0;
        for (Double each : notlistesi) {
             toplamflag+= each;

        }
        double ortalama=toplamflag/notlistesi.size();

        System.out.println(ortalama);

        int ortalamauzeri=0;

        for (Double each : notlistesi) {

            if (each >ortalama) {
                ortalamauzeri++;
                

        }

        }
        System.out.println("ortalamauzeri = " + ortalamauzeri);
    }
}
