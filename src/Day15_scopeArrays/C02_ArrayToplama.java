package Day15_scopeArrays;

import java.util.Arrays;

public class C02_ArrayToplama {

    //Verilen bir int arraydaki tum elementleri toplayip yazdirian method olusturunuz

    public static void main(String[] args) {

    int [] sayilar = {3,4,5,6};
        elementToplami(sayilar);

        int [] yeniArr={3,4,5,6,8};
        sayilar=yeniArr;

        System.out.println("Sayilar Array'inin yeni hali "+ Arrays.toString(sayilar));

        elementToplami(sayilar);
    }
    public static void elementToplami(int [] arr){

        int toplam=0; // once toplami olusturuyourz

        for (int i = 0; i <arr.length ; i++) {

            toplam+=arr[i];

        }
        System.out.println("Verilen Arraydaki elementlerin toplami"+toplam);
    }
}
