package java_addtional_practices;

public class C03_UsDegeriDondurme {

    //4-verilen bir sayi icin istenen us degerini hesaolayip donduren bir method olusturun



    public static void main(String[] args) {

        C02_UstHesaplamaMethodu.usYazdir(3,4);
        usHesap(3,2);


    }

    public static int usHesap (int sayi, int us){

        int sonuc= 1;

        while (us > 0 ) {

            sonuc *= sayi;
            us--;
        }
        return sonuc;
    }
}
