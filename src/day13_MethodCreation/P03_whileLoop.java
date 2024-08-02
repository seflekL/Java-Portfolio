package day13_MethodCreation;

import java.util.Scanner;

public class P03_whileLoop {
    public static void main(String[] args) {
        /*
        Kullanididan toplanmak uzere sayilar isteyin toplam 500 olur veya gercerse toplami
        yazdirin
         */

        Scanner scan = new Scanner(System.in);


        int toplam = 0;

        while (toplam <= 500) { //500 den kucuk oludusu surece devam edicek
            //while loopw da herzaman soruyu daha sonra sor  yoksa loop
            //yazmaz hep soruyu burda int toplam hep ekle toplami bir artir diyoruz
            System.out.println("Lutfen sayi girip enter basiniz"); //herseferinde sayi sorsun
            int sayi = scan.nextInt();
            toplam+=sayi;


        }
        System.out.println("toplam = " + toplam); //parentezin icine alirsan her sayiyi gosteri
        //parentezin icnde birakarisan topladiklarini da gorusuen
    }}