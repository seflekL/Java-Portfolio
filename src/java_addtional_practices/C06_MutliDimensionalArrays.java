package java_addtional_practices;

import java.util.Arrays;

public class C06_MutliDimensionalArrays {

    public static void main(String[] args) {

        //Cok katli arrayler arrayocmde arry oldugu durumdur

        int[][] sayilar = {{2, 3, 4}, {1, 5},{2}};
        //{{2, 3, 4}, {1, 5}, {2}};

        System.out.println(Arrays.toString(sayilar[0]));// [2, 3, 4]
        System.out.println(Arrays.toString(sayilar[1])); //[1,5]
    //int olan elmeentere tek tek erismek istersek
        // kat sayisi  kadar index gelirtmek gerekir
        //sayilar[0][1] 0 {2.3.4} 1ise inner aray sayininindex bir deki degeri 3/

        System.out.println(sayilar[2][0]);

        System.out.println(Arrays.deepToString(sayilar));//hepsini yazar

        for (int i = 0; i < sayilar.length; i++) {
// hocadan kontrol et sonnunda

        }
    }
}