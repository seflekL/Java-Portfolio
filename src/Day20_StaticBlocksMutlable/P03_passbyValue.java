package Day20_StaticBlocksMutlable;

public class P03_passbyValue {
// verilen bir sayinin karesini alip
    //sayiyi bize dondurren bir method yaziniz




    public static void main(String[] args) {
        int sayi = 10;
        System.out.println(karesiniAl(sayi));// 100

        System.out.println("Method call sonrasi sayinin degeri : "+ sayi); // sadece ust satirda yazdirdik o yuzden 10 yazicak
        //eger methoda yapilan degimisin kalici olamasi istenirse
        //atama yapilmadiir

        sayi=karesiniAl(sayi);  //burada atama yaptik

        System.out.println("Atama yapildiktan sonra saynin degeri "+sayi);
        System.out.println(karesiniAl(sayi)); // deger 10000 olacaktir

    }

    private static int karesiniAl(int sayi) {
        sayi=sayi*sayi; // sayi dondurrecek
        return sayi; // sayi dondurmesi icin sayi return u sayi olarak istedik

    }
}
