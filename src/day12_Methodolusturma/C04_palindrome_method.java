package day12_Methodolusturma;

public class C04_palindrome_method {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Ey edip adana da pide ye"));
        System.out.println(isPalindrome("sanane"));

    }


    public static boolean isPalindrome(String metin){

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }
         if (metin.equalsIgnoreCase(tersMetin)){

             return true;


         } else {
             return false;
         }
    }
}
