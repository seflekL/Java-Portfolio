package Day15_scopeArrays;

import java.util.Arrays;

public class P04_ArrayCreation {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};

         String [] str={"a","b","c"};
         String [] kisi={"Ali"};

         /*
         olusturken once data turu []-array ismi ={uygun secilmis seciyrosunuz }


          */

        System.out.println(arr);  //[I@1d251891
        System.out.println(str);// [Ljava.lang.String;@48140564
        //Array data turundeki direk YAZDIRAMAZLAR
        //direk yazdirirsaniniz refens degersini gosterir

        //Bir array yazdirmak istersek  istersek tostring() methodundan fayladninirz

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));

        System.out.println(arr[3]); // dorruncu index necarsa onu yazdir diyoruz

        arr [3]=128;
        System.out.println(Arrays.toString(arr));

        //arr[5]=101;
        //System.out.println(Arrays.toString(arr));
        //direkt olusturulan eleman kactane yazilmisa okadar leman alir
        // sonradan artralamalarz
        //5 elamanli bir erray 6 elaman eklenmez
        //4 elamanli bir array dondurlemezler

        int []  yeniArr=new int[5]; //boss array defult oan sifir  olusur
        //int aarr + isim = yeni + kac elman olucak
        //yeniArr={12,21,35,50,63}; vu sekilde atanmaz

        int [] yeniArr2={4,6,78,9,13};  //direk ataraz degerleri arasinda fark bu
        System.out.println(Arrays.toString(yeniArr2));

        int []  yeniArr4={4,6,78,13};

        yeniArr2=yeniArr4;

        System.out.println(Arrays.toString(yeniArr2));

        System.out.println(arr.length);
        System.out.println(yeniArr4.length);
    }
}
