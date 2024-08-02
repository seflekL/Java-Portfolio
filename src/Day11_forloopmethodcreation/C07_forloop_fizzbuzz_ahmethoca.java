package Day11_forloopmethodcreation;

import java.util.Scanner;

public class C07_forloop_fizzbuzz_ahmethoca {
    public static void main(String[] args) {

        //sour 8 interview- Kullanidan pozitf bir sayi alin
        //1 den baslayarak tum sayilari yazdirin , sira
        //-3 ile bolenebilen bir sayiya gelirse sayi yerine fizz
        //5 ile bolunebilen bir sayi gelirsa sayi yerine buzz yazdirin


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam  sayi giriniz");

        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) { // hem uce hem 5 bolunebilri sayi fizz buzzyazdir
                System.out.println("fizzBuzz ");

            } else if (i % 3 == 0) {
                System.out.println("fizz");

            } else if (i % 5 == 0) {
                System.out.println("fizz");


            } else
                System.out.println(i + " ");

        }


    }
}

