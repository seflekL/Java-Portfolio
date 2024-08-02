package Day15_scopeArrays;

import java.util.Arrays;

public class C03_ArrayTumelemlarini_ {
    public static void main(String[] args) {
        //soru verilen int aaryin tum elamanalarini 2 artirrip
        //bie donduren bir method olsuturun
        //eski arrayi yeni haliyle kaydedin

        int []arr={4,7,2};


        arr=elemanmlarinARtir(arr, 2); // en son yaptin ikiser artti

        System.out.print(Arrays.toString(arr));
    }

    public static int [] elemanmlarinARtir(int [] arr, int artismiktari){ //ilk burayi ayzdin

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=arr[i]+artismiktari;

        }
        return arr;

    }


}
