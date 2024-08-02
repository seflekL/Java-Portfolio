package Day10_stringManipulation;

import java.util.Scanner;

public class P06_forLoop_odevsorusu {
    public static void main(String[] args) {

 /*
 Kullanicidan pozitif bir tamsayi alin,
1’den girilen sayiya kadar(girilen sayi dahil)
7 ila bolunebilen sayilari yazdirin
  */

        Scanner scan=new Scanner(System.in);

        System.out.print("Pozitif bir tam sayi giriniz");

        int sayi= scan.nextInt();

        for (int i = 0; i <=sayi; i++) {
            if (i%7==0){  //1 ile girilen sayiilarainda ki 1 bolunen sayilari
                          //bakabilmek icin i 17 katlarina bakiyoruz
                System.out.print(i+" "); //ln yanina yazsin diye kaldiriyouz
            }
        }
    }
}
