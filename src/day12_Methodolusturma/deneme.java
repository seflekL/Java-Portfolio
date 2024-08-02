package day12_Methodolusturma;

public class deneme {  //java main methoda biter oyuzden cagirmak zorundasin

    public static void main(String[] args) {

  buyukOlaniyazdir(5, 5);


    }



   //simdili vodie kadar sabut name   iki sayi istedi icin int sayi1/2
    public static void buyukOlaniyazdir (int sayi1,int sayi2){

        if (sayi1>sayi2){

            System.out.println("Sayilaridan buyuk olan sayi "+ sayi1);
        } else if ( sayi2>sayi1) {
            System.out.println("sayilardan buyuk olan+"+sayi2);

        }else{
            System.out.println("esit olan sayilarda buyuk olan yoktur");

    }
}}
