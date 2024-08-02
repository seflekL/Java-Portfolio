package java_addtional_practices;

import java.util.Random;
import java.util.Scanner;

public class S02_TasKagitMakas {
    public static void main(String[] args) {
        /*
    Bilgisayar ile "tas kagit makas oyunu" oynayiniz.
    Kullanici secimini; Tas icin 1, Kagit icin 2, Makas icin 3 yazarak belirtir.
    Kullanici tahminini yazar, sonra bilgisayarin tahminine göre o elin kazanani belli olur.
    5 kez kazandiktan sonra, asagidaki kurallara göre en fazla kazanan, oyunun galibi olur.

    Kâğıt taşı sarar
    Taş makası kırar
    Makas kağıdı keser
     */

        Scanner scan=new Scanner(System.in);
        Random random=new Random();

        int kullanicisecimi=0;
        int bilgisayarinsecimi=0;

        int kullanici=0;
        int bilgisayar=0;


        do {
            System.out.println("Hosgeldiniz! Lütfen seciminizi sayi olarak belirtiniz. Tas icin 1, Kagit icin 2, Makas icin 3 tuslayiniz");
            kullanicisecimi=scan.nextInt();
            bilgisayarinsecimi=random.nextInt(3)+1;

            if (kullanicisecimi==1&&bilgisayarinsecimi==2){
                System.out.println("Kâğıt taşı sarar, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==1&&bilgisayarinsecimi==3) {
                System.out.println("Taş makası kırar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==2&&bilgisayarinsecimi==1) {
                System.out.println("Kâğıt taşı sarar, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==2&&bilgisayarinsecimi==3) {
                System.out.println("Makas kağıdı keser, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            } else if (kullanicisecimi==3&&bilgisayarinsecimi==1) {
                System.out.println("Taş makası kırar, bilgisayar +1");
                bilgisayar++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);


            } else if (kullanicisecimi==3&&bilgisayarinsecimi==2) {
                System.out.println("Makas kağıdı keser, kullanici +1");
                kullanici++;
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            }else {
                System.out.println("Berabere kaldinizzzzz!");
                System.out.println("Kullanici: "+kullanici + " "+"Bilgisayar: "+ bilgisayar);
            }

        }while (kullanici!=5 && bilgisayar!=5);

        if (kullanici>bilgisayar){
            System.out.println("Kazandiniiiiiiizzzz!!!");
        }else {
            System.out.println("Bilgisayar sizi yendiiiiii, kaybettiniz");

        }

    }
}