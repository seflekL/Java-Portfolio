package java_addtional_practices;

import java.util.Scanner;

public class L09_ForLoops_Soru2 {

    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi girniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            if (i % 7== 0){

                System.out.println("i="+i);
            }

        }
    }
}
