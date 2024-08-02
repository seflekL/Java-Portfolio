package java_addtional_practices;

public class C07_AsalMiMethodu {
    public static void main(String[] args) {

        // Verilen bir sayinin asal olup olmadigini kontrol edip, asal ise true,
        // degilse false donduren bir method olusturun


        System.out.println(asalMi(33));
        System.out.println(asalMi(52332));
        System.out.println(asalMi(23));
    }

    public static  boolean asalMi (int sayi){

        boolean sonuc=true;
        int boluneceksayi=2;

        while (boluneceksayi < sayi) {

            if (sayi % boluneceksayi == 0){
                sonuc = false;

                break;
            }
            boluneceksayi++;
        }
            return  sonuc;
    }
}
