package java_addtional_practices;

import java.util.Scanner;

public class L07_Switch_Statements_Soru4 {

    //
    // "Lütfen ISTQB kısaltmasından öğrenmek istediğiniz harfi giriniz

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen ISTQB kısaltmasından öğrenmek istediğiniz harfi giriniz");

        char harf = scan.next().charAt(0);

        if (!(harf=='I' || harf =='S' || harf == 'T' || harf== 'Q' || harf=='B' ||
        harf=='i' || harf =='s' || harf == 't' || harf== 'q' || harf=='b')){

            System.out.println("ISTQB birini gir baska birsey degil");

        }

        switch (harf){

            case 'I' :
            case 'i' :
                System.out.println("International"); break;

            case 'S' :
            case 's' :
                System.out.println("Software");break;
            case 'T' :
            case 't' :
                    System.out.println("Testing");break;
            case 'Q' :
            case 'q' :
                System.out.println("Qualification"); break;
            case 'B' :
            case 'b' :
                System.out.println("Board"); break;

            default:
                System.out.println("alt tarfi 5 harften birini girekcesin neyini anlamadin");
        }
        }
    }
