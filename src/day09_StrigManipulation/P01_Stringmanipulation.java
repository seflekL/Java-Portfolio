package day09_StrigManipulation;

public class P01_Stringmanipulation {
    public static void main(String[] args) {

        String str="Ali topu at, at ali at";

        System.out.println(str.contains("Ali"));

        System.out.println(str.startsWith("Ali"));

        System.out.println(str.endsWith("at"));
        System.out.println("-------------------------------------------");
        //indexof() methodu herhangi bir ifade ciersinde gecen harfler
        //veya harfler varsa   bir kelimenin ilk index'ini verir.
        System.out.println(str.length());
        System.out.println(str.indexOf("Ali"));//0 index den baksar

        System.out.println(str.indexOf("ali"));//16 ile donemesi lazim
        System.out.println(str.indexOf("a")); //9
        System.out.println(str.indexOf("top"));
        System.out.println(str.indexOf("levent"));//-1 olamayan kelilme
        System.out.println(str.indexOf('i'));//char oolarak girsek arar
        System.out.println(str.indexOf("at"));
        System.out.println(str.indexOf("at",13));
        System.out.println(str.indexOf(105));// ascii de iye karslik oalani arar


        //lastindexof() methodu aranan harf karakter veya kelimeye son
        //indexten baslangic dogru bakar
        //fakat buluca bastan index sayar
        //



         str="Ali topu at, at ali at";
        System.out.println(str.indexOf("at"));//9
        System.out.println(str.lastIndexOf("at"));
        System.out.println(str.length());
    }
}
