package day13_MethodCreation;

import java.util.Scanner;

public class P05_sifreKontrol {
    public static void main(String[] args) {

        //soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglayincaya kadar yeniden sifre isteyin
        //         tum sartlar saglanirsa, "sifre basariyla kaydedildi" yazdirin ve bitirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali


        Scanner scan=new Scanner(System.in);
        String girilenSifre= "";
         boolean sifreUygunmu=false; ///sifreyi kkontol etmesi icin true olunca duracak donene kadar sorucak

        while (!sifreUygunmu){ //sifreuygunmu degsikeni true donunce duracak
            System.out.print("Lutfen bir sifre giriniz");
            girilenSifre= scan.nextLine();
            sifreUygunmu=sifreKontrol(girilenSifre);

        }

    }

    public static boolean sifreKontrol(String girilenSifre) {
        int hataSayisi=0;    //hata sayisi degisirse hata var demektir.Degismediyse sifre tum sartlara uygundur

        //          - ilk harf kucuk harf olmali

        char ilkKarakter=girilenSifre.charAt(0);
        if (!(ilkKarakter>='a' && ilkKarakter<='z')){
            System.out.println("ilk karekter kucuk harf olmalidir");
            hataSayisi++;
        }
        //son kareketer rakam olamlidir
        char sonKarakter=girilenSifre.charAt(girilenSifre.length()-1); // son harfi kontrol etmek icin
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karekter olarak rakam girmelisiniz");
            hataSayisi++;
        }

        //bosluk var mi ? //contains ile
        if (girilenSifre.contains(" ")){
            System.out.println("Sifrenizde bosluk olmamlidir");
            hataSayisi++;
        }

        //Uzunlugu en az 10 karekter olmalidir

        if (girilenSifre.length()<10){
            System.out.println("Sifreniz en a 10 karekter olmalidir ");
            hataSayisi++;
        }
        if (hataSayisi==0){
            System.out.println("Sifreniz basari ile kaydedildi");
            return true;

        }else {
            return false;
        }
    }
}
