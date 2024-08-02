package day12_Methodolusturma;

public class C01_Return_metod_olusturma {
    public static void main(String[] args) {


    /*
    Her Method bir is yapmak icin olusturulur.
    Biz Methodlarin yaptiklari islem sonucunda
    bize  ne dondurduklerine bakariz

    methodlarin islem sonucu verilen parameterelee gore degisir icin
    return kelimesi daha cok daa turunu belirtir

        */

    String str = "Java Kolaydir";

        System.out.println(str.substring(3)); //ucuncu indexten sonrasini yazdiriyor.

        System.out.println(str.indexOf("a")); //anin karsiligi sayi getir

        System.out.println(str.indexOf("x"));//-1 getirecektir icinde olamdi icin

        System.out.println(str.contains("a")); // true false gelecktir a olduu icin true

        str.substring(7); // birsey yazdirmadi

        //substromg method'u bize String dondurur.
        //29 satirda kod calisir ve' laydir' olarak return yapar
        //ancak biz yazdirmadigimiz icin birsey gormeyiz
        //bize sonuc return eden bir method kullandigimizda iki alternatif war

        //1- direk yazdirip kosoldo sonucu gorebiliriz

        System.out.println(str.substring(7));

        //2- Gorevde yazdirmamiz istenmiyorsa
        //bir variable kaydedebiliriz

        String strIlkYarisi = str.substring(0,str.length()/2);

        System.out.println(str.substring(6));


    }
}
