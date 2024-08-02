package Day08_StringManipulation_testde_var;

public class P05_subSrting_ciftParametre {
    public static void main(String[] args) {

        //subString tek parametreli olunca girilen parametreden sona kadar gider
        //subString cift parametreli ise girilen ilk parametreyi dahil olarak dahil
        //olarak alip ikinci parametreye kadar gider
        //(3,4) girilirse sadece 3. karakteri alir
        //(3,7) girilirse 3,4,5,6 kareketeri alir 7, karakteri olmaz

        String str="Java Heycandir.";

        System.out.println(str.substring(5,6)); //H
        //System.out.println(str.charAt(5)); ayni harfi yazacaktir


        System.out.println(str.substring(0,3)); //Jav

        //son 3 karakteri yazdiralim

        System.out.println(str.length());
        System.out.println(str.substring(str.length()-3));//  tek parametleri
        //// son uc karakteri yazmak icin

        //System.out.println(str.substring(str.length()-3,str.length()));//duplicate oliyor yazmaana gerek yok

        System.out.println(str.substring(4,9));//(9,4) araalik disinda olamaz hata verir

        //string Birlestirme Concatenation

        String str1="Java ";
        String str2="Guzeldir";
        int sayi=12;

        System.out.println(str1+str2); // Java Guzeldir
        System.out.println(str.concat(str2));
        //System.out.println(str.concat(sayi)); concecantion sadece string icindir



    }

}
