package Day15_scopeArrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // bir array iki sekilde olusturabilir
        //1 deklerasyon ve indeki tum elementler yazilabilir

        String[] isimler = {"Mahmut,", "Hasan", "Summeraya"};

        String harfler[] = {"a", "b", "c"};
        //sariya bilir array basa alir

        // 2-deklarasyin ve arrayin elaman sayisi yazilip array olusura bilir

        int[] sayilar = new int[3];// uctane  0; 0 ;0 array olur

        //isimler arraydan hasani yazdir

        System.out.println(isimler[1]); // sira diziinde hasan yazacaktir


        //harfler arrayindeki birinci index yazdirin

        System.out.println(harfler[1]);

        //harfler aaryinin 2.index elmani i yapin

        harfler[2] = "i";

        System.out.println(harfler[2]);

        //harfler arrayeine 4.elaman Q atayin

        //harfler[4] ="q";  index de hata ama 4 elaman olmadigi "Index 4 out of bounds for length 3" hatasi verir
        int[] sayilar44 = {7, 77, 1};

        int[] sayilar3 = new int[3]; //0,0,0

        sayilar3[0] = 5;
        sayilar3[1] = 8;
        sayilar3[2] = 10;

        System.out.println(sayilar3);// vermer array methoduy yapicaggiz sadece refans verir

        System.out.println(Arrays.toString(sayilar3));
    }
}