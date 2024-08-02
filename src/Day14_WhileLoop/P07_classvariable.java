package Day14_WhileLoop;

public class P07_classvariable {

    //class variabllar adindan anlasicagi zuzere class
    // scope icinde ama tum diger kod blokalarinin disinda olustururlar
    //class levelda olusturalan variable en ustte olusturlmak zorunda degildir
    //fakat genel kabul ve gorunurluk acisindan ustte tanimlannmasi uygun gorulur
    //class leveda olusturualan variable kullanim amacacina uygun olucak sekilde
    //static keyvor ile tanimlalanabilir
    //local variabler static olarak isaretlenemzler
    //static olarak isratlenemeyen variabler instance variable denir
    //class variavle ister static olarak isaretlensin isterse isaretlenmesin scoplari tum class olur
    //class variablelar iser static ister olsun ister olmasin deger atamadan deklere ediblebilir kullanilabilirler
    //eger herhangbi bir class  variable deger atamadan olusturulasa kullanacagi zaman java ona default bi deger atar
    //Javanin belirledigi default degerler
    // char ne atar ==> "" (hiclik)
    //sayisal primitive (bytee/short/int/long-==0
    //boolean ==>false
    //non-primitibveler de ==>nukk atar

    static   String str1="Java";  /// insantance bir variable olusrduysam
    //static  variable  sadece static  olur
   static int sayi1=10; // static yaparsam tak main de kkullanirm
   static char a;
   static int  b;
   static double c;
   static String d;
   static boolean e;

    public static void main(String[] args) {

        //static int sayi2=120;  burdda yaamasin
        System.out.println(sayi1); // sayi bir static oldugu icin heryerden ulasilabilir // instance variable lar method icinde
        //calisacaktir class level da tanimlanann
        System.out.println(str1);//static oldugu icin kendinseden olmayini kabul etmez calsismasi icin static yaptik
        System.out.println("args = " + args);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("d = " + d);
        System.out.println("d = " + d);
        System.out.println("e = " + e);


    }
        public void method1(){
            System.out.println("a = " + a);
            System.out.println(sayi1); // sayi bir static oldugu icin heryerden ulasilabilir
            System.out.println(str1);//static oldugu icin kendinseden olmayini kabul etmez calsismasi icin static yaptik

            System.out.println("b = " + b);
            System.out.println("c = " + c);    //static oldugu icin heryerden olusabilir
            System.out.println("a = " + a);
            System.out.println("d = " + d);
            System.out.println("d = " + d);
            System.out.println("e = " + e);

            System.out.println(str1);

        }
            public static void method2 (){

            }
}
