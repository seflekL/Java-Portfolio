package day32Maps;

import java.util.Arrays;
import java.util.HashSet;

public class P03_hasSet {

    public static void main(String[] args) {

        int [] arr={2,2,3,1,5,7,2,6,3,11,1,25,3,6,4,8};

// verilen arrayin tekrarlarini silin  tekrarsiz array olusruun

        HashSet<Integer> tekrarsizArray=new HashSet<>();

        for (int each : arr) {
            tekrarsizArray.add(each);// tekrarsiz arrryde each ekle
        }
        System.out.println(tekrarsizArray);


        arr = new int[tekrarsizArray.size()];
//hashset de  index yapisini deteklemedigi icin kendimiz index yapsini kurabiliriz

        //hashset index yapisini detekelemdigi icin kendimizi index yapisi kurabilir

        int index=0;

        for (Integer each : tekrarsizArray) {
            arr[index]=each;
             index++;
        }
        System.out.println("Terkar eden elamanlarin silimins array"+ Arrays.toString(arr));
    }
}


