package DAY2_DataTurleriScanner;

public class p02_dataTurleri {

    public static void main(String[] args) {

        byte sayi1=23; //hafizada 8 bit yer kaplar

        short sayi2=23; //hafizada 16bit yer kaplar

        int sayi3=23; //hafizada 32 bit yer kaplar

        long sayi4=23; //hafizada 64bit yer kaplar

        char sayi5=80; //80nin ascii karsilik gelen sayiyi yazar  tirnaksiz yazman
        char chr1='a'; // tirnak koayarsan sadece a verir
        char chr2=' '; // space de bir karekterdir
        //char chr3='80'; yapilamaz

        //metinsel kareketerler icin

String str1="Java Candir";//stirng  data turu metinsel ifade icerir
                          //stirng   S buyuk olucak ve cift tirnak da yazilacak
        String telno="55555555"; //Telefon numarasi sting olarak tanimlanmistir
        //uzerinde degisiklik yapilamaz sadece degistirilebilir

        System.out.println("str1");// str1 yqzar
        System.out.println(str1);//Java Candir sayi yazar

        int x=128;
        int y=312;

        System.out.println("Verilen iki sayinin Toplami   "+ (x+y)); 
        //cift tirnaginin disindaki yer boslukalri dikkate almaz 
        
        int ogrencinumara;
        // PRIMATIVE DEGER VERMEDEN OLUSTURABILIR AMA DEGER AATAMADAN KULLANILAMAZ
        ogrencinumara=9720016;

        System.out.println("ogrencinumara = " + ogrencinumara);

        double d1=20.368;
        double d2=6;
        System.out.println(d1/d2);// sonuc neyse onu vericek

        float fl1=2.1f; //float larde hep f koy ne olur ne olmaz
        float  fl2=5f;

        System.out.println(fl1/fl2);




    }






}
