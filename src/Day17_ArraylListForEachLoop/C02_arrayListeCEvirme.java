package Day17_ArraylListForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_arrayListeCEvirme {
    public static void main(String[] args) {


        Integer [] sayilar= {3,5,2,6,7,3,4,5};
        //Bu arrayi liste cevirin
        //bir Loop ile arraydaki tum elementleri listeye ekliyebiliriz

        List <Integer> sayiList1= new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {

            sayiList1.add(sayilar[i]);

        }
        System.out.println(sayiList1);
        sayiList1.add(9);
        sayiList1.remove(0);
        System.out.println(sayiList1);

        //asis ile yapmak isterse
/*
Var olan bir arrayi tek bir satirlar  as list kullanarak listeye cevire biliriz
Ancak
bu cevirme islemi ile olusturan listede problem:
****asList() ile donusturlen listeye
****array ozelligi oldugu gibi ekleme veya silme yapamazsiniz

***
 */
        List <Integer> sayiList2 = Arrays.asList(sayilar);

      //  System.out.println("As is ile donusturelen liste " +sayiList2);

       // sayiList2.add(9);//UnsupportedOperationException caliszmaz
          //  sayiList2.remove(0);//UnsupportedOperationException caliszmaz

        //Arrayde yaptigimiz degisikler listeye de yansir
        //ayni sekilde listede yaptigimiz degsikler arraye de islenir

        sayilar [0]= 23;
        sayilar [1]=15;
        System.out.println("Array atadaktidan sonra tekrar normale doner"+ Arrays.toString(sayilar));

    }
}
