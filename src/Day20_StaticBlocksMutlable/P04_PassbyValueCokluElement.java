package Day20_StaticBlocksMutlable;

import java.util.Arrays;

public class P04_PassbyValueCokluElement {

    /*
    Soru:
    Verilen bir int array'in her bir elamanini 2 artirip
    arrayin yeni halini yazdiran bir method olusturun
        */

    public static void main(String[] args) {

        int [] arr={3,5,7};
        elamanlariArttir(arr);
        System.out.println("Method call sonrasi array"+ Arrays.toString(arr));

       arrayUzat(arr);
        System.out.println("Arrayuzat method calistiktan call sonrasi array"+ Arrays.toString(arr));

        //Method call sonrasi array[5, 7, 9]
    //Arrayin uzunlugundan 1 elman fazla olan yeni bir arrray olusturlarim
    //bu array'in tum elemanlari 5 olsun
    //sonra bu yeni arrayi yolladigimiz arraye atayaalim
    //Arrayin son halini yazdiran method olusturunuz


    }

    private static void arrayUzat(int[] arr) {
        int [] yeniArr=new int[arr.length+1];
        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=5;

        }
        arr=yeniArr;
        System.out.println("Arrayin son halini "+ Arrays.toString(arr));
    }

    public static void elamanlariArttir(int [] arb) { // arb ne oldugu onemli degik

       for (int i = 0; i <arb.length ; i++) {
           arb[i]+=2;


       }
       System.out.println(Arrays.toString(arb)); //[5, 7, 9]
    }

}
