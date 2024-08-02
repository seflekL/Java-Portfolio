package day05_operators_ifelse_statements;

public class P01_operators {
    public static void main(String[] args) {

        /*
        java da bir cok operator vardir. Bu operatorler

           asiigment atama operatorler =
           karsilastirma operatorleri
           mantiksal operatorler
           matematiksel operatorler

         */

        //atama operatoru
        //herhangi variable  deger verdigimizde ona karslik gelen degeri yazariz

        int a = 125;

        //karsilastirma operatorleri

        //1-esitleik operatoru (==)
        //java = ile esitlik kontorlu yapamz atama islemi yapar
        //iki degerin esit  olup olmadigini kontrol etmek icin == operator kullanir
        //bu operator bize boolean sonuc true yada falsa  gelecektir


        int sayi1 = 10;

        int sayi2 = 20;

        System.out.println(sayi1==sayi2);

        //!= operator sag tarinin sol tarfina esit olmadini ifade eder
        //java da herhangi bir mantikalsa degerin onune ! isaret konularsa o degil anlamai olusturur
        // !true --- bu operatorda dogru olmadigini soylemiyoruz
        //!false---- true  olduguu soyler

        System.out.println(sayi1!=sayi2);

        //Mantiksal operaratorler

        //(And) operatoru && iki kolusunm yada mantiksal degerin birlikte dogru olamasini  ister

        int c=12;
        int b=20;
        int d=8;

        System.out.println(b>c && c>d); //iki ifade dogru ise   true veriri
        System.out.println(b>c && d>c);// ilk ifade dogru oldugu icin ikinci saymaz false false true true
        System.out.println(b>c & d>c);// tek & icin  butun hesabi yapip bize doneck

        /*
        or operetoru: ||
        or operatoru saginda ki yada solundaki ifadelerden  birini dogru olmasi yeterlidir
        sadece bir tanesi dogru ise true verir
        ikiside de  yanlis ise false verir

                 */

        System.out.println(b>c || d>c);//true vericek birtanesi dogru olsayeter
        System.out.println(b<c || d<c);//true vericek birtanesi dogru yeter
        System.out.println(b<c || d>c);//iki side yanlis oldugu icin false diyecek

        /*
        > : buyuktur
        < : kucuktur
        >= :buyuk esittir
        <= kucuk esittir
         */

    //Matematiksel Operatorler

        /*
        +toplama: saginda soyi ile solndaki sayiyi toplar
        -toplama: saginda soyi ile solndaki sayiyi cikarir
        *toplama: saginda soyi ile solndaki sayiyi carapr
        /toplama: saginda soyi ile solndaki sayiyi boler
         */

        int toplam= a+b;
        System.out.println("toplam = " + toplam);

        int fark=a-c;
        System.out.println("fark = " + fark);

        int carpim=c*d;
        System.out.println("carpim = " + carpim);

        double oran=a/b;

        int kalan=a%b;

        System.out.println("kalan = " + kalan);

        //


    }
}
