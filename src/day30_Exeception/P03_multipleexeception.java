package day30_Exeception;

import java.util.Scanner;

public class P03_multipleexeception {

    public static void main(String[] args) {

        String str="Java candir";

        String [] harfler={"a","b","c","d","e","f","g","h","i","j"};

        /*
        Kullanicadan bir sayi alip bu sayiyi index olarak kaydedi str ve array deki o indexte yer alan
        elamani yazdiririn

        input : 3  output : a,d
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Aradiginiz index numarasini girniz");

        int indexNo= scan.nextInt();
    //eger olasi hata durumlari birbirliyle alakali degile  (parent-chil 7gibi)

        // 1- her bir hata blogu icin ayri ayri try catch olusturmak

        try {
            System.out.print(str.charAt(indexNo));
        } catch (Exception e) {
            System.out.println("Girilen deger aralik disindadir anam");
        }
        System.out.print("-");
        try {
            System.out.println(harfler[indexNo]);
        } catch (Exception e) {
            System.out.println("Girilen deger aralik disindadir anam");

        }

        //10 girirsen Exception in thread "main"
        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    //12 girersek Exception in thread "main"
        // java.lang.StringIndexOutOfBoundsException: String index out of range: 12





    }

}
