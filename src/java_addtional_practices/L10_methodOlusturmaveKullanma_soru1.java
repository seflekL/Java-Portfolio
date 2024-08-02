package java_addtional_practices;

public class L10_methodOlusturmaveKullanma_soru1 {
    /*
    Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin
     */
    static String output="";
    public static void main(String[] args) {

        String input="Kendi basina calismak da guzel";
        stringdekiHarfleriYazdir(input,3,7);
    }

    private static void stringdekiHarfleriYazdir(String input,int baslangic,int bitis) {
        if (baslangic>bitis){
            System.out.println("HATA: Baslangic değeri bitişten küçük olmalıdır.");
        }
        if (baslangic>input.length()||bitis>input.length()){
            System.out.println("HATA: String indeks sınırları dışında bir giriş yaptınız");
        }
        input=input.replace(" ","");
        for (int i = baslangic; i < bitis; i++) {

            output+=input.charAt(i)+",";

        }
        System.out.print(output);

    }
}