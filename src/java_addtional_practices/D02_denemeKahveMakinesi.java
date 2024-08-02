package java_addtional_practices;

import java.util.Scanner;

public class D02_denemeKahveMakinesi {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Kahce Seciminizi yapiniz"+"\n1-Turk Kahvesi"+"\n2-Filtre Kahve"+ "\n3-Espresso");
        System.out.println("Icmek istediginiz kahvenin adini yaziniz");
        String hangiKahve= scan.nextLine();

        if (hangiKahve.equalsIgnoreCase("Turk kahvesi")) {

            System.out.println(hangiKahve+"Kahveniz hazirlaniyor");
        }else if (hangiKahve.equalsIgnoreCase("Filtre Kahve")){

            System.out.println(hangiKahve+"Kahveniz hazirlaniyor");
        } else if (hangiKahve.equalsIgnoreCase("Espresso")) {
            System.out.println(hangiKahve+"Kahveniz hazirlaniyor");

        }else{

            System.out.println("Hatali bir tuslama yaptiniz");
        }
        System.out.println("Kahvenize sut istermisiniz");
        String sut= scan.nextLine();
        if (sut.equalsIgnoreCase("evet")){
            System.out.println("Kahvenize sut eklemiyor");
        } else  {
            System.out.println("Kahvenize Sut eklenmiyor");
        }

        System.out.println("Kahvenize seker istermisiniz");
        String seker= scan.nextLine();
        if (seker.equalsIgnoreCase("Evet")){
            System.out.println("Kac seker olsun ");
            int sekerSayi=scan.nextInt();
            System.out.println(sekerSayi+" kadar kahvenize seker ekleniyor");

        }

        String boy="";
        System.out.println("Kahveniz hangi boy olsun"+"\nKucuk boy"+"\nOrta Boy"+"\nBuyuk Boy");{
            boy= scan.nextLine();

            if (boy.equalsIgnoreCase("Kucuk boy") || boy.equalsIgnoreCase("Orta boy") || boy.equalsIgnoreCase("buyuk boy")){

                System.out.println(boy+" Kahveniz hazirdir"+ "\nAfiyet Olsun");
            } else {
                System.out.println("Boyu Kucuk - Orta - Buyuk boy olarak yaziniz");
            }
        }
    }
}
