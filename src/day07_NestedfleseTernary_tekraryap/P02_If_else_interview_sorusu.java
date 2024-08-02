package day07_NestedfleseTernary_tekraryap;

import java.util.Scanner;

public class P02_If_else_interview_sorusu {
    public static void main(String[] args) {

        /*
        Soru ) Interview Question
Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
sadece 400’un kati olan yillar artik yildir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz yılı yazınız: ");
        int year=scan.nextInt();

        if (year%4==0){  //bolunebiiyor mu  artik yil
            if (year%100==0){ //bolunebiliyor mu
                if (year % 400 == 0) { //bolunebiliyor mu
                    System.out.println("Girdiğiniz yıl artık yıldır");
                }else{
                    System.out.println("Girdiğiniz yıl artık yıl değildir.");
                }

            }else {
                System.out.println("Girdiğiniz yıl artık yıldır.");
            }
        }else{
            System.out.println("Girdiğiniz yıl artık yıl değildir.");
        }

        //System.out.println("ternary ile cozumu");

        //String result = year % 100 == 0 ? year % 400 == 0 ? "Artik yil" :
        //"Artik yil degildir" : year % 4== 0 ? "Artik yil degildir";



    }
}


