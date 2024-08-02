package day05_operators_ifelse_statements;

public class p03_increments_Decrements {
    public static void main(String[] args) {

        /*
        Incriment islemi bir sayisal degerin degerini kalici olarak yukselme islemdir
        sayiyi baska bir sayi ile carprak toplayarak arttira biliriz

        -sayinin degerini 3 artirma
        -sayinin degerini beskatina cikarma
        -sayiin degerini bir artirma

         */


        int sayi=12;

        System.out.println("sayi = " + sayi);

        //sayi =sayi+3; birinci yyontem

       // sayi+=3; // sayinin degerini 3 artiriri 15

        //System.out.println("sayinin 3 fazlasi vefrecek = " + sayi);

        sayi*=3; // sayiyi uc ile carpicak sagindaki cikararir

        System.out.println("sayinin 3 kati  = " + sayi);

        sayi++;// sayinin degerini 1 artirir
        System.out.println("sayi deger 1 artar = " + sayi);

        sayi--;// sayinin degerini 1 azaltir

        System.out.println("sayi deger 1 azalir  = " + sayi);


        sayi= sayi-3;// uc azaltir sonra atama apar
        System.out.println("sayi 3 azalticak = " + sayi);
        sayi -=3;//sayiyi alatarak atama yapar.
        System.out.println("sayi tekrar  azaltir ikinci yol = " + sayi);

        sayi /=3; // sayiyi uce bolucek
        System.out.println("sayi 3 bolucek = " + sayi);

        //post-increment /pre incerement

        int number=15;

        //post increment
        System.out.println(number++);//once sayiyi 15 yazdirdir sonra 16 yapar

        System.out.println(number);//16 yazicak

        System.out.println(++number); //once arttirdi sayiyi sonra yazdirdi.
        //pre increment adi veriyoruz


        int number2=18;

        //post increment
        System.out.println(number--);//once sayiyi 18 yazdirdir sonra 17 yapar

        System.out.println(number);//18 yazicak

        System.out.println(--number); //once azalti 17 sayiyi sonra yazdirdi.
        //pre decrement adi veriyoruz








    }
}

