package Day16_Arrays_Mutlidimension;

import Day15_scopeArrays.P08_ElamansayisiniBulma;

import java.util.Arrays;

public class P02ArrayElamanlari_Siralama {
    public static void main(String[] args) {
    //soralmaya ascii  tablosunu gore yapiyor
        int [] intArr={2,12,3,8,25,136,41,9,17};
        String [] strArr= {"Murat","Zeynep","Ali","Buse","Kasim","Cuneyt","Galip","Mustafa"};
        //Array elamanlari siralamak icin sort method kullaniri
        //sort methodu naturel bir sirialama yapar
        //digit karakterleri kuckten buyuge dogru siralama yapar

        System.out.println("Intarray ilk hali" +Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("Sirali Hali Intarray ilk hali" +Arrays.toString(intArr));
        //metin iceren arraylerde ascii karakterleri karsilik gelen sayilara bakarak siralama yapar
        System.out.println("Str array ilk  hali"+Arrays.toString(strArr).toUpperCase());
        Arrays.sort(strArr);
        System.out.println("Str array ilk sirali hali"+Arrays.toString(strArr).toUpperCase());
        //P0XX yaparaka baska methodlardan cagria bilrisin
        P08_ElamansayisiniBulma.elamanSayisiniYazdir(intArr, 325); //var mi bul bakalim
        P08_ElamansayisiniBulma.elamanSayisiniYazdir(intArr, 136); //var mi bul bakalim

        System.out.println(Arrays.binarySearch(intArr, 136)); // sekizinci indexte oldu  sekiz yazacak
        System.out.println(Arrays.binarySearch(intArr, 45));
        System.out.println(Arrays.binarySearch(intArr, 13));
        //13 ariyor ama  yok oolsayi 6 elaman olucakti
        System.out.println(Arrays.binarySearch(intArr, 1));
        System.out.println(Arrays.binarySearch(intArr, 24));//olsayi 7 elman olucak olmadiigi icin -7 cikaraktir

        System.out.println(Arrays.binarySearch(strArr, "Murat"));
        System.out.println(Arrays.binarySearch(strArr, "Ayse"));


        int [] intArr1={2,12,3,8,25,136,41,9,17};
        int [] intArr2={2,12,3,8,25,136,41,9,17};

        System.out.println(Arrays.equals(intArr1, intArr2));
    }
}
