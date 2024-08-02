package Day14_WhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop2 {
    public static void main(String[] args) {

        /*
        Kullanidan toplanmak uzere pozitif sayi pozitif tam  isteyin
        kullanicdan bitiermek istedginde 0 basmasini soyleyin
        kullanici bitirmek istedignde toplam kac adet pozitif tam sayi girdini
        Toplamin kac oldugunu yazdirin
        kullanici negatif sayi girererse "negatif sayi kullanamzsin yazidrin
        bu negatif sayiyi odedini toplamam eklmeyin
           */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int sayiToplam = 0;
        int SayiAdedi = 0;

      do{
           System.out.println("Lutfen toplanmak uzere pozitif tamsayi giriniz"+ "\n Bitirmek icin 0 basiniz");
           sayi= scan.nextInt();

           if (sayi<0){ //girilen sayi negatif ise //
               System.out.println("Negatif sayi kullanamazsiniz");
           } else if (sayi>0) {
               sayiToplam+=sayi;
               SayiAdedi++;
           }
       } while(sayi !=0 );

        System.out.println("Girilen "+ SayiAdedi+"adet pozitif sayinin toplami "+ sayiToplam);
    }

}
//once islemi yapiyor du ile sonunda kontrol ettiriyorsun