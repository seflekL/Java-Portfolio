package Day08_StringManipulation_testde_var;

public class P06_Contains {
    public static void main(String[] args) {
        //char kbaul etmezzzzzzzzzzzzzz
        String str= "Java Cok Guzelmis";

        //contains (0 methodu birbaska stringin varlinga bakar
        //carsa ture yoksa false olur

        //cointains method methodu case sensitve dir

        System.out.println(str.contains("ava"));//true
        System.out.println(str.contains("A"));//false
        System.out.println(str.contains("a"));//true


        //contains methoudu case sensitive dir

        System.out.println(str.contains("Java Cok Guzelmis"));//true gelir harflere dikkat edecegi icin

        System.out.println(str.contains(""));// true der bosluk var hiclik her string war

        System.out.println(str.toUpperCase().contains("A"));//false


    }
}
