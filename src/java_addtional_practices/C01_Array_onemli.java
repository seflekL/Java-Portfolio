package java_addtional_practices;

import java.util.Arrays;

public class C01_Array_onemli {
    public static void main(String[] args) {

        int [] arr={3,5,6,7,8};

        String [] arr2= new String[5];

        //BIR ARRAY OLUSTURUKEN COK ONEMLI IKI KONU COK ONEMLI
        //1- ICINE KOYACAGIMIZ ELEMENTLERIN DATA TURU
        //   Array kendisini non-prmitive bir data turudur
        //   Ancak icine koyacagigmiz data turunude belirtmeliyiz
        //   Arr1 elementleri 1 integer arr2 elementleri string olmak zorundadir.
        //
        //2-Icine kac elemeng lenght olucagi belirtilmelidir


        //Arrayleri yazdirmaik icin Array class dan to string kullaniriz

        System.out.println(Arrays.toString(arr));

        //Array 2. yontemle olusturulmussa yani element atamasi yapilmamissa
        //Java her HER ELEMENT icin belirlenen defualt degerleri atar ve onlari yazdirir
        //Default degerler non-ptimitiveler icin null dir.

        System.out.println(Arrays.toString(arr2));
        //[null, null, null, null, null]

        //herhangi bir elementi yazdirmak veya elemente deger attmak istersek
        //index kullanmaliyiz

        System.out.println(arr[2]);// alti yazakcatir yailar icin to stringe gerekyok

        arr [1]= 10;

        System.out.println(Arrays.toString(arr));//[3, 10, 6, 7, 8]

       // arr[0]=false;
       // arr[0]=10.2;
        //arr[0]="Java"; hicbirini kabul etmez cunku int
        arr[0]='a';// char kabul eder ama onun ascii degerini yaar

       //bir arrayin tum elmentleri yazdirmak istersek parentez olmadan
       //arrayalarda for each loop daha verimli

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");
            
            //for each loop cozumju

            for (int each : arr) {

                System.out.print(each +" ");
            }

        }

    }


}
