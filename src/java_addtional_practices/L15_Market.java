package java_addtional_practices;

import java.time.LocalDateTime;
import java.util.Scanner;

public class L15_Market {

     /*
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET ÜRÜNLERİ
   secime göre;
   4-urunleri listele ve
   5-fiyatlari gelsin
   6-Alışveriş bitince fiş yazdırsın.
   7- Fiş yazdırdıktan sonra da çıkış yapılsın.
*/
    static Scanner scan=new Scanner(System.in);
    static int urunKodu;
    static boolean ekUrun=false;
    static int urunAdedi;
    static String urunAd;
    static int urunFiyat;
    static String sepet="\n";
    static double toplam;

    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("=========T144 -WISE MARKET=========");
        System.out.println("---------Hos Geldiniz--------");
        System.out.println("Lutfen bir secim yapiniz\nAlisveris yapacaginiz reyon numarasini girip enter tusuna basiniz");
        System.out.println("1-Sarktuteri Reyonu\n2-Manav Reyonu\n3-MArket Reyonu\n4-Fis Yazdirma\n5-Cikis");
        int secim =scan.nextInt();

        if(!(secim>=1 && secim<=5)){
            System.out.println("Gecersiz bir islem sectiniz!\nLutfen Yeniden Deneyiniz");
            girisEkrani();
        } else  {

            switch (secim) {
                case 1 :
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3 :
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5 :
                    cikis();
                    break;

                default:

            }
        }

    }

    private static void cikis() {
        System.out.println("----Cikis Yapiliyor----");
        System.exit(0);
    }

    private static void fisyazdir() {
        System.out.println("-----Alisveris Fisi-----");
        System.out.println(" _____Wise Market_____");
        System.out.println("______Iyi gunler_____");
        System.out.println(" ");
        System.out.println(sepet);
        System.out.println("Toplam Tutar :"+toplam);
        System.out.println("KDV : "+(toplam*0.20));
        toplam+=(toplam*0.20);
        System.out.println("Odenecek Tutar :"+ toplam+"KDV Dahil");
        System.out.println("Odenen Miktar ");
        int odeme=scan.nextInt();
        if (odeme<toplam){
            System.out.println("Yapilan odeme toplam tutari karsilamiyor"+ (toplam-odeme)+" kadar daha odeme yapmalisiniz.");
        } else{
            System.out.println("Para Ustu"+(odeme-toplam));
        }
        System.out.println("Bizi Tercih ettiginiz icin tesekkur ederiz\nYine Bekleriz");
        LocalDateTime date = LocalDateTime.now();
        cikis();

    }

    private static void market() {
        System.out.println("----Market Reyonuna Hos Geldiniz----");
        System.out.println("301-Bebekmamasi 300 ₺\n302-Makarna 50 ₺\n303-Icecek 100₺\n304-Deterjan 300₺\n305-Cips 50₺");
        System.out.println("Lutfen Urun Kodunu giriniz");
        while (!ekUrun){
        urunKodu=scan.nextInt();
            if (urunKodu>=301 && urunKodu<=305){
                System.out.println("kac paket almak isterseniz");
                urunAdedi=scan.nextInt();

                switch (urunAdedi){

                    case 301 :
                        urunAd="Bebekmamasi";
                        urunFiyat=300;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 302 :
                        urunAd="Makarna";
                        urunFiyat=50;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;

                    case 303 :
                        urunAd="Icecek";
                        urunFiyat=100;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 304 :
                        urunAd="Deterjan";
                        urunFiyat=300;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 305 :
                        urunAd="Cips";
                        urunFiyat=50;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;


                }
                urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplam"+toplam);
                sepet+=urunAd+":"+urunFiyat+"TL\n";
                System.out.println("Baska bir urun almak isterseniz, urun kodunu girniz\nAna Menuye donmek icin 0 yazip Enter tusuna basiniz");
            } else if (urunKodu==0){
                girisEkrani();
            }


        }
         ekUrun=false;
    }

    private static void manav() {
        System.out.println("----Manav Reyonuna Hos Geldiniz----");
        System.out.println("201-Ananas 80₺\n202-Mandalina 50₺\n203-Elma 75₺\n204-Portakal 60₺\n205-muz 80₺");
        System.out.println("Lutfen urun kodunu giriniz");
        while (!ekUrun){
            urunKodu=scan.nextInt();
            if (urunKodu>=201 && urunKodu<=205){
                System.out.println("Kac Paket almak isterseniz");
                urunAdedi=scan.nextInt();

                switch (urunAdedi){
                    case 201 :
                        urunAd= "Ananas";
                        urunFiyat=80;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 202 :
                        urunAd="Mandalina";
                        urunFiyat=50;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 203 :
                        urunAd="Elma";
                        urunFiyat=75;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 204 :
                        urunAd="Portakal";
                        urunFiyat=60;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;
                    case 205 :
                        urunAd="Muz";
                        urunFiyat=80;
                        System.out.println(urunAdedi+" Paket "+urunAd+" fiyatı: "+(urunAdedi*urunFiyat)+" TL'dir");
                        break;

                }
                urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplam Tutar : "+ toplam);
                sepet+=urunAd+":"+urunFiyat+"TL\n";
                System.out.println("Baska bir urun almak isterseniz,urun kodunu giriniz\nAna menuye donmek icin 0 yazip enter basiniz");

            } else if (urunKodu==0) {
                girisEkrani();

            } else {
                System.out.println("Hatali Giris Ypatiniz");
                manav();
            }

        }
        ekUrun=false;
    }

    private static void sarkuteri() {

        System.out.println("----Sarkuteri Reyonunu Hosgeldiniz----");
        System.out.println("101-Peynir 250₺\n102-Pastirma 600₺\n103-Yogurt 150₺\n104-Sucuk 350₺\n105-Yumurta 100₺");
        System.out.println("Lutfen Urun kodunu Giriniz : ");

        //if (!(urunKodu>=101 && urunKodu<=105)){
        //    System.out.println(urunKodu+" ürün kodlu ürün bulunamadı. Yeniden deneyiniz");
        //    sarkuteri();

        while(!ekUrun){
            urunKodu=scan.nextInt();
            if (urunKodu>=101 && urunKodu <=105){
                System.out.println("Kac paket alicaksiniz ");
                urunAdedi=scan.nextInt();

                switch (urunKodu){

                    case 101 :
                        urunAd="Peynir";
                        urunFiyat=250;
                        System.out.println(urunAdedi+"Paket"+urunAd+"fiyati : "+(urunAdedi*urunFiyat)+"TL`dir");
                        break;

                    case 102 :
                        urunAd="Pastirma";
                        urunFiyat=600;
                        System.out.println(urunAdedi+"Paket"+urunAd+"fiyati : "+(urunAdedi*urunFiyat)+"TL`dir");
                        break;

                    case 103 :
                        urunAd="Yogurt";
                        urunFiyat=150;
                        System.out.println(urunAdedi+"Paket"+urunAd+"fiyati : "+(urunAdedi*urunFiyat)+"TL`dir");
                        break;

                    case 104 :
                        urunAd="Sucuk";
                        urunFiyat=350;
                        System.out.println(urunAdedi+"Paket"+urunAd+"fiyati : "+(urunAdedi*urunFiyat)+"TL`dir");
                        break;
                    case 105 :
                        urunAd="Yumurta";
                        urunFiyat=100;
                        System.out.println(urunAdedi+"Paket"+urunAd+"fiyati : "+(urunAdedi*urunFiyat)+"TL`dir");
                        break;

                }
                urunFiyat=urunAdedi*urunFiyat;
                toplam+=urunFiyat;
                System.out.println("Toplam Tutar : "+toplam);
                sepet+=urunAd+ ":"+urunFiyat+"TL\n";
                System.out.println("Baska bir urun almak isterseniz, urun kodunu giriniz\nAna Menuye donmek icin 0 yazip Enter tusuna basiniz");

            } else if (urunKodu==0) {
                girisEkrani();
                
            }
        }
        ekUrun=false;
    }
}
