package java_addtional_practices;

import java.util.Arrays;

public class L13_arrays_soru1 {

    public static void main(String[] args) {
        /*
        Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int [] arr= { 1,5,7,6,7,15,0,51,90,22,30,55,441,55,20,13,112,2,0,51,};

        int toplam=0;

        System.out.println(Arrays.toString(arrayikiekle(arr)));
        }

    public static int [] arrayikiekle(int [] arr) {

        int [] yeniarr=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            yeniarr[i]=arr[i]+2;

        }arr=yeniarr;

        return arr;
    }
}

