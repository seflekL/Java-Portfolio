package java_addtional_practices;

public class L11_WhileLoop_Soru3 {
/*
While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun.
 */

    static  int flag=0;
    static String isim="Levent";

    public static void main(String[] args) {

         while(flag<10){
              StringBuilder sb= new StringBuilder(isim);
             System.out.println(sb.reverse()+"=Levent");
             flag++;
         }

    }
}
