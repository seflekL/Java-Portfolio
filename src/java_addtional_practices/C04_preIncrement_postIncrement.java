package java_addtional_practices;

public class C04_preIncrement_postIncrement {

    public static void main(String[] args) {

/*

2- int a = 5;
   a = a++;
   int b = 2 * --a;
   int c = ++b + ++a ;
   islemleri sonrasinda a, b ve c degerleri ne olur ?
 */
//++ bainda sonunda olmasnin farki islem yapildigi satirdadir
//eger bu islemin yapildigi satirda iki islem ayni anda yapiliyorsa
//++a artirma isleme once yapilir
//a++ artirma islemi sonra yapilir


        int a = 5;


        a++;
        System.out.println("a = " + a);
        
        int b = 2 * --a;
        System.out.println("b = " + b);

        int c = ++b + ++a;

        System.out.println("c = " + c);

        System.out.println("a: " + a + ",b :" + b + ",c:" + c);

    }
}
