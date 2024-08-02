package Day15_scopeArrays;

import java.util.Arrays;

public class C02_Array {

    public static void main(String[] args) {


        int[] arr = new int[4];

        System.out.println(arr.length);

        arr[1]=5;

        //arraydaki tum elemlari yanlarinda basoluk birakara yazdirin

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+" ");

        }
    }
}
