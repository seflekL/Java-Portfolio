package java_addtional_practices;

import java.util.Scanner;

public class C01_MetindensayiALma {
    public static void main(String[] args) {



    /*
 Bir web sayfasi yapilan arama sonucunda “Aradiginiz Nutella icin 124.456.112
 sonuc bulunmustur” diye sonuc yazdirmaktadir.
 Web sayfasinda arama sonucunda alinan cumledeki bulunan sonuc sayisinin 100 binden fazla
  oldugunu test eden kod yaziniz.
     */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Sonuc cumleisni giriniz...");
        String sonucYazisi="Aradiniz Nutella icin sonuc 124.456.112 sonuc bulmustur";

        //sonuc.replace() butun harfleri teke ek girmek gerekecek
        //replace() de verilen istenen degiskkligi butu metin olarak yapar
        //Ornegin 18.satirdaki kod butun . lari yok eder
        //replaceAll() da isterse tekbir karakteri veya metni parcasini degistirilebilir
        //sonucyazisi.replaceall ("a","t"
        //Amm repalceall un asil kullanim amaci butun sayilar butun bosluar gibi gibi
        //genel ifadeler kullanabilcegimiz regex kullanimidr

        sonucYazisi=sonucYazisi.replaceAll("\\D", "");
        //sonuc yazisi = demek atama yapmak zorundasin
        // yaptigiiz degisklinin kalici olmasi cin
        //atama yapmak zorundasin

        System.out.println(sonucYazisi);

        int sonucSayisi =Integer.parseInt(sonucYazisi);// Goruntu ayni ama sayi artik integer cevirdik
        //parse int ile

        if (sonucSayisi > 100000){
            System.out.println("Aramasonuc sayisi testi Passed");

        }else {

            System.out.println("Arama sonuc sayisi failed ");

        }


}
}
