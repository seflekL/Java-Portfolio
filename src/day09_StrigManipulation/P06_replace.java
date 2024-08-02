package day09_StrigManipulation;

public class P06_replace {
    public static void main(String[] args) {
    
    String  str="Java Candir Selenium Heycandir";
        System.out.println("str = " + str);
    
    str=str.replace('a','A');

        System.out.println("str = " + str);
            
    str=str.replace("CAndir", "Kolaydir");

        System.out.println("str = " + str);

           str="Java Candir Selenium Heycandir";
        System.out.println(str.replaceFirst("a","A")); // tek harfu degistirmek icin

        String str2="Ali git bakkaldan %3, ekmek al Gel!";




    }
}
