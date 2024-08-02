package java_addtional_practices;

public class S01_RakamlariAltaltaYazdirma {
    /*
       12345 sayisinin herbir basamagini konsolda altalta yazdirin.
       input: 12345
       output: 1
               2
               3
               4
               5
        */
    public static void main(String[] args) {
        int sayi=12345;
        int birlerbasamagi=sayi%10;//5
        int onlarbasamagi=(sayi/10)%10;// 1234 ün modulus ini aliyorum
        int yuzlerbasamagi=(sayi/100)%10;
        int binlerbasamagi=(sayi/1000)%10;
        int onbinlerbasamagi=(sayi/10000)%10;
        System.out.println(onbinlerbasamagi+"\n"+binlerbasamagi+"\n"+yuzlerbasamagi+"\n"+onlarbasamagi+"\n"+birlerbasamagi);
    }
}