package java_addtional_practices;

public class L08_String_Manipulations_Soru3 {
    /*
        Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
 input : java1 ogRe2@nMek3 #ne +Gu=zel
 output : Java ogrenmek ne guzel.
         */

  static String input="java1 ogRe2@nMek3 #ne +Gu=zel";
  static String output="";
  public static void main(String[] args) {


   for (int i = 0; i < input.length(); i++) {
    if (Character.isLetter(input.charAt(i))){
     output+=input.charAt(i);
    }
   }
   System.out.println(output.toLowerCase());
  }
 }






