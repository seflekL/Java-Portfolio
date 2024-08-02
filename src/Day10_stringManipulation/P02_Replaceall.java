package Day10_stringManipulation;

public class P02_Replaceall {

    public static void main(String[] args) {
        String str="J4a5va G3uzel65d25i25869r";

       // str=str.replace("4", "");
        //bu satir sadece 4 leri degistirir
        System.out.println(str);

        //tum rakamlari degistirmek icin yada silme icin replaceall () methodu kullanir


        str=str.replaceAll("\\d","");

        System.out.println(str);

        System.out.println(str.replaceAll("\\D", "a"));


        /*
\\d: rakamlarla eşleşir(digit)          \\D: Rakam olmayan herşeyle eşleşir
\\s: space karakterleri ile eşleşir     \\S: Boşluk olmayan herşeyle eşleşir
\\s+ :yanyana birden fazla boşluk varsa onu ifade eder
\\w: harf,rakam,_(altçizgi) olan karakterleri ifade eder
\\W: harf,rakam,_(altçizgi) olmayan karakterleri ifade eder
 */

        str=" Java          Ogrenemek cok guzel";
        System.out.println(str.replaceAll("\\s" , "")); //JavaOgrenemekcokguzel bosluklarin hepsini silecektir
        System.out.println(str.replaceAll("\\s+" , "")); //JavaOgrenemekcokguzel bosluklarin hepsini silecektir
        System.out.println(str.replaceAll("\\s+" , " ")); //Java Ogrenemek cok guzel bosluklarin hepsini silecektir

        System.out.println(str);
        System.out.println("======================================================");

        String str2="Java candir";

        System.out.println(str.repeat(5)); //anlik
        str2=str2.repeat(5);//atama yaparak degistirir
        System.out.println("str2 = " + str2);

        str2="      Java     Candir       ";

        System.out.println(str2.trim()); ///basindaki sonundaki boslukalari siler
    }
}
