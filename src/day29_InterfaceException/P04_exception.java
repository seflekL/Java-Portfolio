package day29_InterfaceException;

public class P04_exception {

    /*
    Java compile ederken variablearin degerlerini goremez sadece data turlerini bilir yazdigimiz kodlari systax erlesimi ve
    data turune gore kontrol eder  uygun olmayan durumlarda CTE (comptile time error)
    Fakat bazi durumlarda sadece COmpile time Error degil compile time xception verir

    sting no = 5 olmaz  string no 5 diyemezsin

     */

   static   String str="Java Candir";

    public static void main(String[] args) {

        try {
            System.out.println(str.substring(5));

            System.out.println(str.substring(10));

            str=null;

            System.out.println(str);
            System.out.println(str.length());
        } catch (Exception e) {

            System.out.println("Dertler");
         }
    }
}
