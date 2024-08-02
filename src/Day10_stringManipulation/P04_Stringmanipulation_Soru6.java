package Day10_stringManipulation;

import java.util.Scanner;

public class P04_Stringmanipulation_Soru6 {
    public static void main(String[] args) {


        /*

Kullanicidan alinan bir String alin, String'in uzunlugu cift sayi ise tam ortasina :) ekleyin,
String'in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir kelime griniz");

        String kelime= scan.next();
        String str1="";
        String str2="";

        if (kelime.length()%2==0){

            str1=kelime.substring(0,kelime.length()/2);
            str2=kelime.substring(kelime.length()/2);
            kelime=str1+":)"+str2;
            System.out.println(kelime);


        }else {

            str1=kelime.substring(0,kelime.length()/2);
            str2=kelime.substring(kelime.length()+1/2);
            str2=str2.replace("\\w", "");
            kelime=str1+":(" +str2;
            System.out.println("  "+kelime);
        }
    }
}
