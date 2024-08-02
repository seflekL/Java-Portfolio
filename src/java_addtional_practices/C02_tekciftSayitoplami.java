package java_addtional_practices;

public class C02_tekciftSayitoplami {
    public static void main(String[] args) {


        int [] arr= {1,4,6,7,8,9,5,3,6,9,1,3,5,76,8,1,3,4,6,7,227};

        int teksayilarinToplami=0;

        int ciftsayilarinToplami=0;


        //for each loop ile cozumu

        for ( int each : arr ){  //arr getiriyor

            if (each % 2 == 0){ // eger gelen sayi ciftse ciftler toplamami ekleneek
                ciftsayilarinToplami+= each;

            } else { // eger yukarida cift sayi degilse tek sayisini ekledim
                teksayilarinToplami+=each; // each  ekte ekliyor tek oldugu icin

            }
        }  if (teksayilarinToplami>ciftsayilarinToplami) System.out.println("tekler kazandi");
        else if (ciftsayilarinToplami>teksayilarinToplami) {
            System.out.println("ciftler kazandi");


        }else {
            System.out.println("beraere");
        }
    }
}
