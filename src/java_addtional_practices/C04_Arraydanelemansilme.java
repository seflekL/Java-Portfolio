package java_addtional_practices;

import java.util.Arrays;

public class C04_Arraydanelemansilme {
    public static void main(String[] args) {


  //  3- Verilen bir array’den istenen elemani silip, kalani bir array
    //butun ucleri silsin

        int [] arr = {7,3,5,9,2,3,5,5,9,1,4};
        int sileneekSayi=3;



        System.out.println(Arrays.toString(arraydanElamansil(arr,3)));

    }
    public static int[] arraydanElamansil(int [] arr, int sileneceEleman){
        //once silecenek elemanlar disinda cak eleman  var oldugunu bulalim
        int yeniArrlenght= 0;
        for (int each : arr) {

            if (each !=sileneceEleman ){
                yeniArrlenght++;

            }
        }


        int [] yeniarr = new int [yeniArrlenght];
        int yeniarrATanaubdexi=0;
        for (int eachEski : arr ){

            //eski arraydeki tum elementleri ytek tek getiricek
            //bizde gelen elementi kontrol edip silinecek sayiya esit degilse yeni arraya element olarak ekleyecegiz
            if (eachEski !=sileneceEleman){
                //yeni arrye lement olarak ekeleycegiz

            yeniarr[yeniarrATanaubdexi]= eachEski;
            yeniarrATanaubdexi++;
            }
        }
        return yeniarr;
    }
}
