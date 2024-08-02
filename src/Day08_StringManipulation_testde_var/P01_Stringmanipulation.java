package Day08_StringManipulation_testde_var;

import java.util.Locale;

public class P01_Stringmanipulation {
    public static void main(String[] args) {


        String str="Java Candir, Selenium Heycandir";
        System.out.println(str.toLowerCase(Locale.JAPANESE));
        //dililegli bir sorunu bu sekilde locale komutu cozer

        //Verilen str'nin hepsinin buuyuk harf yapalim

        str=str.toUpperCase(); //JAVA CANDIR SELEMIUM HEYCANDIR yazacaktir

        System.out.println("str = " + str);

        //verilen str'in tum harflerini kucuk yazdirin

        System.out.println(str.toLowerCase()); //kucuk harflerle yazacaktir

        //str'in 7 harfini yazdirin

        System.out.println(str.toLowerCase().charAt(6));//ilk harf sifirdan baslar buyuzden 6 koyuyoruz
    //str icinde kac karaketer var

        System.out.println(str.length());//lenght bosluk  da d

        //son harfi yazdir

        System.out.println(str.charAt(31-1)); //son harfi yazacktir 0 oldugu icin

        //System.out.println(31); index fazladan harf girilse hata vericekktir
        //daha buyuk deger girilirse hata verir
        //aralik disinda der


        //sondan 6.harfi yazdirilarim

        System.out.println(str.toLowerCase().charAt(5));




    }
}
