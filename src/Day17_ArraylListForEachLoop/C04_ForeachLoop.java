package Day17_ArraylListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ForeachLoop {
    public static void main(String[] args) {

         /*
         Verilen bir arra de tekrar eden elementleri icin mukerrer olanalri silip
         tum elamanlari sadece 1 tane yapip eski arraye yeni halini atayip yazdirin


          */

        int [] arr={3,4,4,5,4,3,2,3,6,5,4,3,2};

        List <Integer> benzersisList = new ArrayList<>();
//data turuu integer oldugu icin yaziyourz
         for ( int each : arr  ){
        if(!benzersisList.contains(each)){
            benzersisList.add(each);

        }
         }

        System.out.println(benzersisList);

         //arraydan ellaman silmedigmiz icin istedigmiz elemenlerire sahip yeni bir array olustur.


        arr = new int[benzersisList.size()]; //[o,o,o,o]
        //arr index olmadan atama yapamayiz bu yuzden for loop kullanim
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = benzersisList.get(i);
        }

        System.out.println("Arrayin son hali"+ Arrays.toString(arr));
    }
}
