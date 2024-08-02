package Day08_StringManipulation_testde_var;

public class p04_subString {
    public static void main(String[] args) {

        String str="Java Guzeldir.";
   //               0123=a olusacak adan sonra Guzledir yazacak
        System.out.println(str.substring(3));//a Guzeldir yazar.

        //son harfi subsrting ileb bulmak


        System.out.println(str.substring(str.length()-1));
        //son karakter olan L verecektir

        System.out.println(str.length());//14

        //System.out.println(str.substring(20));//calistirmadan hata vermez
        //calsitirdiginda o sati olmadigi icin hata werecektir













    }



}
