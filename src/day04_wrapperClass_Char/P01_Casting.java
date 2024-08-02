package day04_wrapperClass_Char;

import java.util.Scanner;

public class P01_Casting {
    public static void main(String[] args) {

        int sayi1=26;
        int sayi2=4;

        System.out.println(sayi1/sayi2);
        //5.5 yerine 6 cikti matemeksel islemler de her iki deger int ise sonuc int olur
        //sonuc double bile olsa noktadan sonra silip int olarak doner

        double sayi3=30;

        System.out.println(sayi3/sayi2);
        //double +int  matemematiksel deger olarak toplana bilir
          // degerlerden bir tanesi bile double ise sonuc dobule olrak doner

        //Soru: Int olarak kullanidan 3 sayi alarak bunlarin sonucunu double olarak yazin

        Scanner scan2=new Scanner(System.in);

        System.out.println("Lutfen 3 sayi giriniz");
        System.out.println("1.Sayi: ");
        int sayi4= scan2.nextInt();  //15
        System.out.println("2.Sayi  ");
        int sayi5= scan2.nextInt(); //20
        System.out.println("3.Sayi: ");
        int sayi6= scan2.nextInt(); //30

        System.out.println("Girilen Sayilarin Ortalamasi: " +(sayi6+sayi5+sayi4)/3); //20

        //eger bolunen ve blolen int ise sonuc int doner

        System.out.println("Girilen Sayilarin Ortalamasi: " +((double)(sayi6+sayi5+sayi4)/3)); //21.66
        System.out.println("Girilen Sayilarin Ortalamasi: " +(double)(sayi6+sayi5+sayi4)/3); //21
        System.out.println("Girilen Sayilarin Ortalamasi: " +(double)((sayi6+sayi5+sayi4)/3)); //21
        //son sairda once islemi yapti int sayilar en icteki parantez baslar
        //ilk sayilari buldu ikinic olarak double oldugu icin dobule verdi

        System.out.println("Girilen Sayilarin Ortalamasi: " +(double)((sayi6+(double)sayi5+sayi4)/3)); //21




    }
}
