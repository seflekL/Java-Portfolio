package Day17_ArraylListForEachLoop;

public class P09_Runner {


    public static void main(String[] args) {

        /*

         P08_Okul       ogr1      =            new       P08_Okul();
         Class Ismi    obje    aassignment  keyword     Constructor
         Data türü     ismi       sign

         */

        /*
        Bir bir classtan obje olusturudugumuzda o objenin olusturuldugu class daki tum variable ve
        ve methodlarin bir kopyasini da olusturulmus oluruz
        dolasiyla sadece variable ve methodlara ulasmakla kalmaz
        o class da atanmis olan egerlre de sahip olur

        Java da bir obje olusturdugumzda objenin olustudurgu class taki constructor calisir
        Constructor calisinca olusturulan objeye ilk degerlerini atiyor

        Biz bir class olusturunca herhanb bi constructor gormuyoruz
        fakat bir deger atamasi yapabilmek icin  construcor calistirlmasi zorunlduur
        Java bunu bldigi icin her class olusturdurdugmuzda bir  Defualt Constructor gizili olarak ol
        olusturur
        Biz eger kendimiz bir parametresiz constructor olusturrsak defualt siliniyor



         */


        P08_Okul ogr1=new P08_Okul();
        ogr1.ogretmenAd="Murat";
        ogr1.ogretmenBrans="Fizik";
        System.out.println(ogr1.ogretmenAd);
        System.out.println(ogr1.ogretmenBrans);
        System.out.println(ogr1.ogretmenYas);
        System.out.println(ogr1.ogretmenSicilNo);


        P08_Okul ogr2=new P08_Okul();
        ogr2.ogretmenAd="Levent";
        ogr2.ogretmenBrans="Core Java";

        P08_Okul pers1=new P08_Okul();
        pers1.personelAd="Tarık";
    }
}