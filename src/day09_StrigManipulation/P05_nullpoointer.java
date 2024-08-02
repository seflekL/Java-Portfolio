package day09_StrigManipulation;

public class P05_nullpoointer {

    public static void main(String[] args) {

        //non-primitive data turlerine atama yaomadan olustara bilriz deger atanamamis
        //deger atanamamis uyarasi verebilir
        //nonprimitiveleri atama yapmadan kullanamayiz


        String metin;
        //    System.out.println(metin); variable deger atanmamis uyarisi verecektir

        String metin2=""; //hiclik yazdirir

        System.out.println(metin2);
        //'' dahi oosa atansa hata vermeden calisir

        String metin3=null;

        System.out.println(metin3);

        //metin 2 ile metin 3 arasinda ki far hjava metin 2 ye deger atandigni
        //metin 3 deger ataamadigni anlar

        System.out.println(metin2.length());

       //System.out.println(metin3.length());//nullpointer execption

       System.out.println(metin2.isEmpty());
       System.out.println(metin2.isBlank());

       //System.out.println(metin3.isEmpty());

       //System.out.println(metin3.isBlank());


    }
}
